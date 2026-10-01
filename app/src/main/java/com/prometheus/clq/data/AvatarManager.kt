package com.prometheus.clq.data

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.PorterDuff
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ImageView
import android.widget.ProgressBar
import coil.load
import coil.transform.CircleCropTransformation

/**
 * Gestionnaire des 22 avatars CLQ.
 *
 * Chaque avatar a 3 états visuels basés sur les PV (mode Glou) :
 * - NORMAL  : PV > 60% → Image originale
 * - HURT    : PV 30-60% → Teinte orange + légère désaturation
 * - CRITICAL: PV < 30% → Teinte rouge + forte désaturation + pulsation
 */
object AvatarManager {

    // ===== AVATAR DATA =====

    data class Avatar(
        val id: String,
        val name: String,
        val emoji: String,
        val description: String,
        val drawableResName: String,    // Nom du drawable (sans extension)
        val cdnUrl: String = ""         // URL CDN Leonardo (fallback réseau)
    )

    enum class HpState {
        NORMAL,     // > 60% PV
        HURT,       // 30-60% PV
        CRITICAL    // < 30% PV
    }

    // Les 22 avatars CLQ
    private val avatars = listOf(
        Avatar("avatar_scientist", "Le Savant", "\uD83E\uDDEC", "Génie en herbe, toujours curieux", "avatar_scientist"),
        Avatar("avatar_ninja", "Le Ninja", "\uD83E\uDD77", "Rapide et silencieux, frappe fort", "avatar_ninja"),
        Avatar("avatar_pirate", "Le Pirate", "\uD83C\uDFF4\u200D\u2620\uFE0F", "À l'abordage du savoir !", "avatar_pirate"),
        Avatar("avatar_robot", "Le Robot", "\uD83E\uDD16", "Calculateur et précis", "avatar_robot"),
        Avatar("avatar_astronaut", "L'Astronaute", "\uD83D\uDE80", "Explorer les étoiles du quiz", "avatar_astronaut"),
        Avatar("avatar_viking", "Le Viking", "\u2694\uFE0F", "Guerrier du savoir nordique", "avatar_viking"),
        Avatar("avatar_knight", "Le Chevalier", "\uD83D\uDEE1\uFE0F", "Noble défenseur de la vérité", "avatar_knight"),
        Avatar("avatar_wizard", "Le Magicien", "\uD83E\uDDD9", "Maître des arcanes", "avatar_wizard"),
        Avatar("avatar_detective", "Le Détective", "\uD83D\uDD0D", "Rien ne lui échappe", "avatar_detective"),
        Avatar("avatar_chef", "Le Chef", "\uD83D\uDC68\u200D\uD83C\uDF73", "Cuisine les bonnes réponses", "avatar_chef"),
        Avatar("avatar_rockstar", "La Rockstar", "\uD83C\uDFB8", "Du rock et des réponses", "avatar_rockstar"),
        Avatar("avatar_superhero", "Le Super-Héros", "\uD83E\uDDB8", "Sauveur de quiz", "avatar_superhero"),
        Avatar("avatar_pharaoh", "Le Pharaon", "\uD83C\uDFDB\uFE0F", "Sagesse millénaire", "avatar_pharaoh"),
        Avatar("avatar_samurai", "Le Samouraï", "\u2694\uFE0F", "Honneur et précision", "avatar_samurai"),
        Avatar("avatar_alien", "L'Alien", "\uD83D\uDC7D", "Intelligence extraterrestre", "avatar_alien"),
        Avatar("avatar_cowboy", "Le Cowboy", "\uD83E\uDD20", "Sheriff du quiz", "avatar_cowboy"),
        Avatar("avatar_dragon", "Le Dragon", "\uD83D\uDC09", "Feu et sagesse", "avatar_dragon"),
        Avatar("avatar_panda", "Le Panda", "\uD83D\uDC3C", "Zen mais redoutable", "avatar_panda"),
        Avatar("avatar_lion", "Le Lion", "\uD83E\uDD81", "Roi du quiz", "avatar_lion"),
        Avatar("avatar_wolf", "Le Loup", "\uD83D\uDC3A", "Instinct de chasseur", "avatar_wolf"),
        Avatar("avatar_fox", "Le Renard", "\uD83E\uDD8A", "Malin comme un renard", "avatar_fox"),
        Avatar("avatar_phoenix", "Le Phoenix", "\uD83D\uDD25", "Renaît toujours plus fort", "avatar_phoenix"),
        // === 15 nouveaux avatars (CLQ_v12) ===
        Avatar("avatar_archeologist", "L'Arch\u00E9ologue", "\uD83C\uDFDB", "Aventurier en qu\u00EAte de savoir", "avatar_archeologist"),
        Avatar("avatar_artist", "L'Artiste", "\uD83C\uDFA8", "Peint les bonnes r\u00E9ponses", "avatar_artist"),
        Avatar("avatar_chef_master", "Le Ma\u00EEtre Chef", "\uD83D\uDC68\u200D\uD83C\uDF73", "Cuisine le savoir au feu", "avatar_chef_master"),
        Avatar("avatar_cyborg", "Le Cyborg", "\uD83E\uDD16", "Mi-humain, mi-machine", "avatar_cyborg"),
        Avatar("avatar_doctor", "Le Docteur", "\uD83E\uDE7A", "Diagnostic 100% vrai", "avatar_doctor"),
        Avatar("avatar_explorer", "L'Explorateur", "\uD83C\uDFD4", "Brave les zones glaciales", "avatar_explorer"),
        Avatar("avatar_gamer", "Le Gamer", "\uD83C\uDFAE", "Manette en main, score en or", "avatar_gamer"),
        Avatar("avatar_magician", "Le Magicien", "\uD83C\uDFA9", "Ma\u00EEtre des cartes mystiques", "avatar_magician"),
        Avatar("avatar_mecha", "Le Pilote Mecha", "\uD83E\uDD16", "Armure orange, courage acier", "avatar_mecha"),
        Avatar("avatar_mermaid", "La Sir\u00E8ne", "\uD83E\uDDDC", "Myst\u00E8res des profondeurs", "avatar_mermaid"),
        Avatar("avatar_pilot", "Le Pilote", "\u2708\uFE0F", "Top Gun du quiz", "avatar_pilot"),
        Avatar("avatar_priestess", "La Pr\u00EAtresse", "\u2728", "Sagesse divine", "avatar_priestess"),
        Avatar("avatar_steampunk", "L'Inventeur Steampunk", "\u2699\uFE0F", "Engrenages et inventions", "avatar_steampunk"),
        Avatar("avatar_vampire", "Le Vampire", "\uD83E\uDDDB", "\u00C9l\u00E9gance gothique", "avatar_vampire"),
        Avatar("avatar_yeti", "Le Y\u00E9ti", "\u2744\uFE0F", "Force des montagnes glac\u00E9es", "avatar_yeti"),
        // === Avatars cosmiques placeholder (existants) ===
        Avatar("avatar_c001", "Comète", "\u2B50", "Avatar cosmique #1", "avatar_c001"),
        Avatar("avatar_c002", "Ombre", "\u2B50", "Avatar cosmique #2", "avatar_c002"),
        Avatar("avatar_c003", "Éclair", "\u2B50", "Avatar cosmique #3", "avatar_c003"),
        Avatar("avatar_c004", "Nova", "\u2B50", "Avatar cosmique #4", "avatar_c004"),
        Avatar("avatar_c005", "Pixel", "\u2B50", "Avatar cosmique #5", "avatar_c005"),
        Avatar("avatar_c006", "Zephyr", "\u2B50", "Avatar cosmique #6", "avatar_c006"),
        Avatar("avatar_c007", "Aurora", "\u2B50", "Avatar cosmique #7", "avatar_c007"),
        Avatar("avatar_c008", "Titan", "\u2B50", "Avatar cosmique #8", "avatar_c008"),
        Avatar("avatar_c009", "Mystic", "\u2B50", "Avatar cosmique #9", "avatar_c009"),
        Avatar("avatar_c010", "Quartz", "\u2B50", "Avatar cosmique #10", "avatar_c010"),
        Avatar("avatar_c011", "Rubis", "\u2B50", "Avatar cosmique #11", "avatar_c011"),
        Avatar("avatar_c012", "Saphir", "\u2B50", "Avatar cosmique #12", "avatar_c012"),
        Avatar("avatar_c013", "Jade", "\u2B50", "Avatar cosmique #13", "avatar_c013"),
        Avatar("avatar_c014", "Onyx", "\u2B50", "Avatar cosmique #14", "avatar_c014"),
        Avatar("avatar_c015", "Opale", "\u2B50", "Avatar cosmique #15", "avatar_c015"),
        Avatar("avatar_c016", "Cristal", "\u2B50", "Avatar cosmique #16", "avatar_c016"),
        Avatar("avatar_c017", "Neon", "\u2B50", "Avatar cosmique #17", "avatar_c017"),
        Avatar("avatar_c018", "Laser", "\u2B50", "Avatar cosmique #18", "avatar_c018"),
        Avatar("avatar_c019", "Plasma", "\u2B50", "Avatar cosmique #19", "avatar_c019"),
        Avatar("avatar_c020", "Photon", "\u2B50", "Avatar cosmique #20", "avatar_c020"),
        Avatar("avatar_c021", "Volt", "\u2B50", "Avatar cosmique #21", "avatar_c021"),
        Avatar("avatar_c022", "Bolt", "\u2B50", "Avatar cosmique #22", "avatar_c022"),
        Avatar("avatar_c023", "Storm", "\u2B50", "Avatar cosmique #23", "avatar_c023"),
        Avatar("avatar_c024", "Blaze", "\u2B50", "Avatar cosmique #24", "avatar_c024"),
        Avatar("avatar_c025", "Frost", "\u2B50", "Avatar cosmique #25", "avatar_c025"),
        Avatar("avatar_c026", "Flame", "\u2B50", "Avatar cosmique #26", "avatar_c026"),
        Avatar("avatar_c027", "Ember", "\u2B50", "Avatar cosmique #27", "avatar_c027"),
        Avatar("avatar_c028", "Spark", "\u2B50", "Avatar cosmique #28", "avatar_c028"),
        Avatar("avatar_c029", "Glow", "\u2B50", "Avatar cosmique #29", "avatar_c029"),
        Avatar("avatar_c030", "Shine", "\u2B50", "Avatar cosmique #30", "avatar_c030"),
        Avatar("avatar_c031", "Star", "\u2B50", "Avatar cosmique #31", "avatar_c031"),
        Avatar("avatar_c032", "Moon", "\u2B50", "Avatar cosmique #32", "avatar_c032"),
        Avatar("avatar_c033", "Sun", "\u2B50", "Avatar cosmique #33", "avatar_c033"),
        Avatar("avatar_c034", "Sky", "\u2B50", "Avatar cosmique #34", "avatar_c034"),
        Avatar("avatar_c035", "Cloud", "\u2B50", "Avatar cosmique #35", "avatar_c035"),
        Avatar("avatar_c036", "Wave", "\u2B50", "Avatar cosmique #36", "avatar_c036"),
        Avatar("avatar_c037", "Tide", "\u2B50", "Avatar cosmique #37", "avatar_c037"),
        Avatar("avatar_c038", "River", "\u2B50", "Avatar cosmique #38", "avatar_c038"),
        Avatar("avatar_c039", "Ocean", "\u2B50", "Avatar cosmique #39", "avatar_c039"),
        Avatar("avatar_c040", "Lake", "\u2B50", "Avatar cosmique #40", "avatar_c040"),
        Avatar("avatar_c041", "Mountain", "\u2B50", "Avatar cosmique #41", "avatar_c041"),
        Avatar("avatar_c042", "Valley", "\u2B50", "Avatar cosmique #42", "avatar_c042"),
        Avatar("avatar_c043", "Forest", "\u2B50", "Avatar cosmique #43", "avatar_c043"),
        Avatar("avatar_c044", "Desert", "\u2B50", "Avatar cosmique #44", "avatar_c044"),
        Avatar("avatar_c045", "Tundra", "\u2B50", "Avatar cosmique #45", "avatar_c045"),
        Avatar("avatar_c046", "Canyon", "\u2B50", "Avatar cosmique #46", "avatar_c046"),
        Avatar("avatar_c047", "Island", "\u2B50", "Avatar cosmique #47", "avatar_c047"),
        Avatar("avatar_c048", "Volcano", "\u2B50", "Avatar cosmique #48", "avatar_c048"),
        Avatar("avatar_c049", "Glacier", "\u2B50", "Avatar cosmique #49", "avatar_c049"),
        Avatar("avatar_c050", "Meadow", "\u2B50", "Avatar cosmique #50", "avatar_c050"),
        Avatar("avatar_c051", "Atlas", "\u2B50", "Avatar cosmique #51", "avatar_c051"),
        Avatar("avatar_c052", "Hermes", "\u2B50", "Avatar cosmique #52", "avatar_c052"),
        Avatar("avatar_c053", "Apollo", "\u2B50", "Avatar cosmique #53", "avatar_c053"),
        Avatar("avatar_c054", "Ares", "\u2B50", "Avatar cosmique #54", "avatar_c054"),
        Avatar("avatar_c055", "Zeus", "\u2B50", "Avatar cosmique #55", "avatar_c055"),
        Avatar("avatar_c056", "Poseidon", "\u2B50", "Avatar cosmique #56", "avatar_c056"),
        Avatar("avatar_c057", "Hades", "\u2B50", "Avatar cosmique #57", "avatar_c057"),
        Avatar("avatar_c058", "Odin", "\u2B50", "Avatar cosmique #58", "avatar_c058"),
        Avatar("avatar_c059", "Thor", "\u2B50", "Avatar cosmique #59", "avatar_c059"),
        Avatar("avatar_c060", "Loki", "\u2B50", "Avatar cosmique #60", "avatar_c060"),
        Avatar("avatar_c061", "Sage", "\u2B50", "Avatar cosmique #61", "avatar_c061"),
        Avatar("avatar_c062", "Mage", "\u2B50", "Avatar cosmique #62", "avatar_c062"),
        Avatar("avatar_c063", "Cleric", "\u2B50", "Avatar cosmique #63", "avatar_c063"),
        Avatar("avatar_c064", "Druid", "\u2B50", "Avatar cosmique #64", "avatar_c064"),
        Avatar("avatar_c065", "Ranger", "\u2B50", "Avatar cosmique #65", "avatar_c065"),
        Avatar("avatar_c066", "Bard", "\u2B50", "Avatar cosmique #66", "avatar_c066"),
        Avatar("avatar_c067", "Monk", "\u2B50", "Avatar cosmique #67", "avatar_c067"),
        Avatar("avatar_c068", "Paladin", "\u2B50", "Avatar cosmique #68", "avatar_c068"),
        Avatar("avatar_c069", "Warlock", "\u2B50", "Avatar cosmique #69", "avatar_c069"),
        Avatar("avatar_c070", "Rogue", "\u2B50", "Avatar cosmique #70", "avatar_c070"),
        Avatar("avatar_c071", "Echo", "\u2B50", "Avatar cosmique #71", "avatar_c071"),
        Avatar("avatar_c072", "Mirage", "\u2B50", "Avatar cosmique #72", "avatar_c072"),
        Avatar("avatar_c073", "Nebula", "\u2B50", "Avatar cosmique #73", "avatar_c073"),
        Avatar("avatar_c074", "Cosmos", "\u2B50", "Avatar cosmique #74", "avatar_c074"),
        Avatar("avatar_c075", "Galaxy", "\u2B50", "Avatar cosmique #75", "avatar_c075"),
        Avatar("avatar_c076", "Comet", "\u2B50", "Avatar cosmique #76", "avatar_c076"),
        Avatar("avatar_c077", "Meteor", "\u2B50", "Avatar cosmique #77", "avatar_c077"),
        Avatar("avatar_c078", "Eclipse", "\u2B50", "Avatar cosmique #78", "avatar_c078"),
        Avatar("avatar_c079", "Solstice", "\u2B50", "Avatar cosmique #79", "avatar_c079"),
        Avatar("avatar_c080", "Zenith", "\u2B50", "Avatar cosmique #80", "avatar_c080"),
        Avatar("avatar_c081", "Ivory", "\u2B50", "Avatar cosmique #81", "avatar_c081"),
        Avatar("avatar_c082", "Ebony", "\u2B50", "Avatar cosmique #82", "avatar_c082"),
        Avatar("avatar_c083", "Coral", "\u2B50", "Avatar cosmique #83", "avatar_c083"),
        Avatar("avatar_c084", "Amber", "\u2B50", "Avatar cosmique #84", "avatar_c084"),
        Avatar("avatar_c085", "Garnet", "\u2B50", "Avatar cosmique #85", "avatar_c085"),
        Avatar("avatar_c086", "Topaz", "\u2B50", "Avatar cosmique #86", "avatar_c086"),
        Avatar("avatar_c087", "Pearl", "\u2B50", "Avatar cosmique #87", "avatar_c087"),
        Avatar("avatar_c088", "Emerald", "\u2B50", "Avatar cosmique #88", "avatar_c088"),
        Avatar("avatar_c089", "Diamond", "\u2B50", "Avatar cosmique #89", "avatar_c089"),
        Avatar("avatar_c090", "Agate", "\u2B50", "Avatar cosmique #90", "avatar_c090"),
        Avatar("avatar_c091", "Shadow", "\u2B50", "Avatar cosmique #91", "avatar_c091"),
        Avatar("avatar_c092", "Light", "\u2B50", "Avatar cosmique #92", "avatar_c092"),
        Avatar("avatar_c093", "Dawn", "\u2B50", "Avatar cosmique #93", "avatar_c093"),
        Avatar("avatar_c094", "Dusk", "\u2B50", "Avatar cosmique #94", "avatar_c094"),
        Avatar("avatar_c095", "Twilight", "\u2B50", "Avatar cosmique #95", "avatar_c095"),
        Avatar("avatar_c096", "Midnight", "\u2B50", "Avatar cosmique #96", "avatar_c096"),
        Avatar("avatar_c097", "Morning", "\u2B50", "Avatar cosmique #97", "avatar_c097"),
        Avatar("avatar_c098", "Noon", "\u2B50", "Avatar cosmique #98", "avatar_c098"),
        Avatar("avatar_c099", "Evening", "\u2B50", "Avatar cosmique #99", "avatar_c099"),
        Avatar("avatar_c100", "Night", "\u2B50", "Avatar cosmique #100", "avatar_c100"),
        Avatar("avatar_c101", "Falcon", "\u2B50", "Avatar cosmique #101", "avatar_c101"),
        Avatar("avatar_c102", "Hawk", "\u2B50", "Avatar cosmique #102", "avatar_c102"),
        Avatar("avatar_c103", "Raven", "\u2B50", "Avatar cosmique #103", "avatar_c103"),
        Avatar("avatar_c104", "Swan", "\u2B50", "Avatar cosmique #104", "avatar_c104"),
        Avatar("avatar_c105", "Crane", "\u2B50", "Avatar cosmique #105", "avatar_c105"),
        Avatar("avatar_c106", "Pelican", "\u2B50", "Avatar cosmique #106", "avatar_c106"),
        Avatar("avatar_c107", "Seagull", "\u2B50", "Avatar cosmique #107", "avatar_c107"),
        Avatar("avatar_c108", "Sparrow", "\u2B50", "Avatar cosmique #108", "avatar_c108"),
        Avatar("avatar_c109", "Robin", "\u2B50", "Avatar cosmique #109", "avatar_c109"),
        Avatar("avatar_c110", "Cardinal", "\u2B50", "Avatar cosmique #110", "avatar_c110"),
        Avatar("avatar_c111", "Leopard", "\u2B50", "Avatar cosmique #111", "avatar_c111"),
        Avatar("avatar_c112", "Cheetah", "\u2B50", "Avatar cosmique #112", "avatar_c112"),
        Avatar("avatar_c113", "Jaguar", "\u2B50", "Avatar cosmique #113", "avatar_c113"),
        Avatar("avatar_c114", "Lynx", "\u2B50", "Avatar cosmique #114", "avatar_c114"),
        Avatar("avatar_c115", "Cougar", "\u2B50", "Avatar cosmique #115", "avatar_c115"),
        Avatar("avatar_c116", "Puma", "\u2B50", "Avatar cosmique #116", "avatar_c116"),
        Avatar("avatar_c117", "Panther", "\u2B50", "Avatar cosmique #117", "avatar_c117"),
        Avatar("avatar_c118", "Ocelot", "\u2B50", "Avatar cosmique #118", "avatar_c118"),
        Avatar("avatar_c119", "Serval", "\u2B50", "Avatar cosmique #119", "avatar_c119"),
        Avatar("avatar_c120", "Caracal", "\u2B50", "Avatar cosmique #120", "avatar_c120"),
        Avatar("avatar_c121", "Cobra", "\u2B50", "Avatar cosmique #121", "avatar_c121"),
        Avatar("avatar_c122", "Viper", "\u2B50", "Avatar cosmique #122", "avatar_c122"),
        Avatar("avatar_c123", "Mamba", "\u2B50", "Avatar cosmique #123", "avatar_c123"),
        Avatar("avatar_c124", "Adder", "\u2B50", "Avatar cosmique #124", "avatar_c124"),
        Avatar("avatar_c125", "Boa", "\u2B50", "Avatar cosmique #125", "avatar_c125"),
        Avatar("avatar_c126", "Iguana", "\u2B50", "Avatar cosmique #126", "avatar_c126"),
        Avatar("avatar_c127", "Gecko", "\u2B50", "Avatar cosmique #127", "avatar_c127"),
        Avatar("avatar_c128", "Chameleon", "\u2B50", "Avatar cosmique #128", "avatar_c128"),
        Avatar("avatar_c129", "Komodo", "\u2B50", "Avatar cosmique #129", "avatar_c129"),
        Avatar("avatar_c130", "Dolphin", "\u2B50", "Avatar cosmique #130", "avatar_c130"),
        Avatar("avatar_c131", "Whale", "\u2B50", "Avatar cosmique #131", "avatar_c131"),
        Avatar("avatar_c132", "Orca", "\u2B50", "Avatar cosmique #132", "avatar_c132"),
        Avatar("avatar_c133", "Seal", "\u2B50", "Avatar cosmique #133", "avatar_c133"),
        Avatar("avatar_c134", "Otter", "\u2B50", "Avatar cosmique #134", "avatar_c134"),
        Avatar("avatar_c135", "Penguin", "\u2B50", "Avatar cosmique #135", "avatar_c135"),
        Avatar("avatar_c136", "Walrus", "\u2B50", "Avatar cosmique #136", "avatar_c136"),
        Avatar("avatar_c137", "Narwhal", "\u2B50", "Avatar cosmique #137", "avatar_c137"),
        Avatar("avatar_c138", "Manatee", "\u2B50", "Avatar cosmique #138", "avatar_c138"),
        Avatar("avatar_c139", "Platypus", "\u2B50", "Avatar cosmique #139", "avatar_c139"),
        Avatar("avatar_c140", "Butterfly", "\u2B50", "Avatar cosmique #140", "avatar_c140"),
        Avatar("avatar_c141", "Bee", "\u2B50", "Avatar cosmique #141", "avatar_c141"),
        Avatar("avatar_c142", "Ant", "\u2B50", "Avatar cosmique #142", "avatar_c142"),
        Avatar("avatar_c143", "Spider", "\u2B50", "Avatar cosmique #143", "avatar_c143"),
        Avatar("avatar_c144", "Scorpion", "\u2B50", "Avatar cosmique #144", "avatar_c144"),
        Avatar("avatar_c145", "Beetle", "\u2B50", "Avatar cosmique #145", "avatar_c145"),
        Avatar("avatar_c146", "Mantis", "\u2B50", "Avatar cosmique #146", "avatar_c146"),
        Avatar("avatar_c147", "Dragonfly", "\u2B50", "Avatar cosmique #147", "avatar_c147"),
        Avatar("avatar_c148", "Firefly", "\u2B50", "Avatar cosmique #148", "avatar_c148"),
        Avatar("avatar_c149", "Moth", "\u2B50", "Avatar cosmique #149", "avatar_c149"),
        Avatar("avatar_c150", "Lotus", "\u2B50", "Avatar cosmique #150", "avatar_c150"),
        Avatar("avatar_c151", "Daisy", "\u2B50", "Avatar cosmique #151", "avatar_c151"),
        Avatar("avatar_c152", "Tulip", "\u2B50", "Avatar cosmique #152", "avatar_c152"),
        Avatar("avatar_c153", "Rose", "\u2B50", "Avatar cosmique #153", "avatar_c153"),
        Avatar("avatar_c154", "Orchid", "\u2B50", "Avatar cosmique #154", "avatar_c154"),
        Avatar("avatar_c155", "Lily", "\u2B50", "Avatar cosmique #155", "avatar_c155"),
        Avatar("avatar_c156", "Violet", "\u2B50", "Avatar cosmique #156", "avatar_c156"),
        Avatar("avatar_c157", "Iris", "\u2B50", "Avatar cosmique #157", "avatar_c157"),
        Avatar("avatar_c158", "Peony", "\u2B50", "Avatar cosmique #158", "avatar_c158"),
        Avatar("avatar_c159", "Jasmine", "\u2B50", "Avatar cosmique #159", "avatar_c159"),
        Avatar("avatar_c160", "Oak", "\u2B50", "Avatar cosmique #160", "avatar_c160"),
        Avatar("avatar_c161", "Maple", "\u2B50", "Avatar cosmique #161", "avatar_c161"),
        Avatar("avatar_c162", "Pine", "\u2B50", "Avatar cosmique #162", "avatar_c162"),
        Avatar("avatar_c163", "Cedar", "\u2B50", "Avatar cosmique #163", "avatar_c163"),
        Avatar("avatar_c164", "Birch", "\u2B50", "Avatar cosmique #164", "avatar_c164"),
        Avatar("avatar_c165", "Willow", "\u2B50", "Avatar cosmique #165", "avatar_c165"),
        Avatar("avatar_c166", "Cherry", "\u2B50", "Avatar cosmique #166", "avatar_c166"),
        Avatar("avatar_c167", "Bamboo", "\u2B50", "Avatar cosmique #167", "avatar_c167"),
        Avatar("avatar_c168", "Palm", "\u2B50", "Avatar cosmique #168", "avatar_c168"),
        Avatar("avatar_c169", "Sequoia", "\u2B50", "Avatar cosmique #169", "avatar_c169"),
        Avatar("avatar_c170", "Noctis", "\u2B50", "Avatar cosmique #170", "avatar_c170"),
        Avatar("avatar_c171", "Solis", "\u2B50", "Avatar cosmique #171", "avatar_c171"),
        Avatar("avatar_c172", "Lumen", "\u2B50", "Avatar cosmique #172", "avatar_c172"),
        Avatar("avatar_c173", "Umbra", "\u2B50", "Avatar cosmique #173", "avatar_c173"),
        Avatar("avatar_c174", "Aether", "\u2B50", "Avatar cosmique #174", "avatar_c174"),
        Avatar("avatar_c175", "Ignis", "\u2B50", "Avatar cosmique #175", "avatar_c175"),
        Avatar("avatar_c176", "Terra", "\u2B50", "Avatar cosmique #176", "avatar_c176"),
        Avatar("avatar_c177", "Aqua", "\u2B50", "Avatar cosmique #177", "avatar_c177"),
        Avatar("avatar_c178", "Ventus", "\u2B50", "Avatar cosmique #178", "avatar_c178"),
        Avatar("avatar_c179", "Lux", "\u2B50", "Avatar cosmique #179", "avatar_c179"),
        Avatar("avatar_c180", "Comète 2", "\u2B50", "Avatar cosmique #180", "avatar_c180")
    )

    // ===== PUBLIC API =====

    fun getAllAvatars(): List<Avatar> = avatars

    fun getAvatar(id: String): Avatar? = avatars.find { it.id == id }

    fun getAvatarByIndex(index: Int): Avatar? = avatars.getOrNull(index)

    fun getDefaultAvatar(): Avatar = avatars[3] // Robot par défaut

    /**
     * Calcule l'état HP pour un joueur (mode Glou).
     * @param currentPv PV actuels
     * @param maxPv PV maximum (défaut 30)
     */
    fun getHpState(currentPv: Int, maxPv: Int = 30): HpState {
        val ratio = currentPv.toFloat() / maxPv
        return when {
            ratio > 0.6f -> HpState.NORMAL
            ratio > 0.3f -> HpState.HURT
            else -> HpState.CRITICAL
        }
    }

    /**
     * Charge l'avatar dans une ImageView avec l'état HP appliqué.
     * Utilise le drawable local en priorité, sinon l'URL CDN.
     */
    fun loadAvatar(
        imageView: ImageView,
        avatarId: String,
        hpState: HpState = HpState.NORMAL,
        circleCrop: Boolean = true
    ) {
        val context = imageView.context
        val avatar = getAvatar(avatarId) ?: getDefaultAvatar()

        // Chercher le drawable local
        val resId = context.resources.getIdentifier(
            avatar.drawableResName, "drawable", context.packageName
        )

        val request = if (resId != 0) {
            // Drawable local trouvé
            imageView.load(resId) {
                crossfade(true)
                if (circleCrop) transformations(CircleCropTransformation())
            }
        } else if (avatar.cdnUrl.isNotEmpty()) {
            // Fallback URL CDN
            imageView.load(avatar.cdnUrl) {
                crossfade(true)
                if (circleCrop) transformations(CircleCropTransformation())
            }
        } else {
            // Fallback placeholder
            imageView.setImageResource(android.R.drawable.ic_menu_gallery)
            null
        }

        // Appliquer le filtre HP
        applyHpFilter(imageView, hpState)
    }

    /**
     * Applique un filtre couleur DRAMATIQUE en fonction de l'état HP.
     * Les effets sont très visibles pour que le joueur voit clairement la dégradation.
     */
    fun applyHpFilter(imageView: ImageView, hpState: HpState) {
        // Arrêter toute animation en cours
        imageView.clearAnimation()
        (imageView.getTag(getTagKey(imageView)) as? ValueAnimator)?.cancel()

        when (hpState) {
            HpState.NORMAL -> {
                imageView.colorFilter = null
                imageView.alpha = 1.0f
                imageView.scaleX = 1.0f
                imageView.scaleY = 1.0f
            }
            HpState.HURT -> {
                // Teinte orange FORTE + désaturation marquée
                val matrix = ColorMatrix().apply {
                    setSaturation(0.35f) // Désaturation visible
                }
                val tintMatrix = ColorMatrix(floatArrayOf(
                    1.6f, 0.1f, 0f, 0f, 50f,    // R fort
                    0f, 0.75f, 0f, 0f, 15f,      // G réduit
                    0f, 0f, 0.4f, 0f, 0f,         // B très réduit
                    0f, 0f, 0f, 1f, 0f
                ))
                matrix.postConcat(tintMatrix)
                imageView.colorFilter = ColorMatrixColorFilter(matrix)
                imageView.alpha = 0.9f
                imageView.scaleX = 1.0f
                imageView.scaleY = 1.0f
            }
            HpState.CRITICAL -> {
                // Teinte rouge INTENSE + quasi noir & blanc + pulsation
                val matrix = ColorMatrix().apply {
                    setSaturation(0.1f) // Quasi gris
                }
                val tintMatrix = ColorMatrix(floatArrayOf(
                    2.0f, 0f, 0f, 0f, 80f,       // R très fort
                    0f, 0.2f, 0f, 0f, 0f,         // G quasi absent
                    0f, 0f, 0.2f, 0f, 0f,          // B quasi absent
                    0f, 0f, 0f, 1f, 0f
                ))
                matrix.postConcat(tintMatrix)
                imageView.colorFilter = ColorMatrixColorFilter(matrix)

                // Animation de pulsation (heartbeat effect)
                val pulseAnim = ValueAnimator.ofFloat(0.85f, 1.0f).apply {
                    duration = 600
                    repeatCount = ValueAnimator.INFINITE
                    repeatMode = ValueAnimator.REVERSE
                    interpolator = AccelerateDecelerateInterpolator()
                    addUpdateListener { anim ->
                        val scale = anim.animatedValue as Float
                        imageView.scaleX = scale
                        imageView.scaleY = scale
                        imageView.alpha = 0.5f + (scale - 0.85f) * 2.5f // Alpha 0.5-0.875
                    }
                }
                imageView.setTag(getTagKey(imageView), pulseAnim)
                pulseAnim.start()
            }
        }
    }

    /**
     * Met à jour la barre de PV avec une couleur dynamique (vert→jaune→orange→rouge).
     */
    fun updatePvBar(progressBar: ProgressBar, currentPv: Int, maxPv: Int) {
        progressBar.max = maxPv
        // Animer le changement de progression
        val anim = ObjectAnimator.ofInt(progressBar, "progress", progressBar.progress, currentPv)
        anim.duration = 400
        anim.interpolator = AccelerateDecelerateInterpolator()
        anim.start()

        // Changer la couleur de la barre selon les PV
        val ratio = currentPv.toFloat() / maxPv
        val color = when {
            ratio > 0.6f -> android.graphics.Color.parseColor("#00E676") // Vert
            ratio > 0.35f -> android.graphics.Color.parseColor("#FFD740") // Jaune
            ratio > 0.2f -> android.graphics.Color.parseColor("#FF9100") // Orange
            else -> android.graphics.Color.parseColor("#FF1744")          // Rouge
        }
        progressBar.progressDrawable?.setColorFilter(color, PorterDuff.Mode.SRC_IN)
    }

    /**
     * Applique un effet d'élimination (grisé + rétréci).
     */
    fun applyEliminatedEffect(imageView: ImageView) {
        (imageView.getTag(getTagKey(imageView)) as? ValueAnimator)?.cancel()
        val matrix = ColorMatrix().apply { setSaturation(0f) }
        imageView.colorFilter = ColorMatrixColorFilter(matrix)
        imageView.alpha = 0.3f
        imageView.scaleX = 0.8f
        imageView.scaleY = 0.8f
    }

    private fun getTagKey(imageView: ImageView): Int = com.prometheus.clq.R.id.tag_pulse_anim

    /**
     * Retourne le drawable resource ID pour un avatar, ou 0 si pas trouvé.
     */
    fun getAvatarDrawableId(context: Context, avatarId: String): Int {
        val avatar = getAvatar(avatarId) ?: return 0
        return context.resources.getIdentifier(
            avatar.drawableResName, "drawable", context.packageName
        )
    }
}
