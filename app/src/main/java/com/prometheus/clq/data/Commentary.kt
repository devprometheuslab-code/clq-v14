package com.prometheus.clq.data

import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Question

/**
 * Genere :
 *  - Le texte d'explication affiche dans le menu deroulant
 *  - Les commentaires drole / moqueur / felicitation, choisis selon :
 *      1) la priorite : streak win/lose (>= 2)
 *      2) sinon : combinaison difficulte x bonne/mauvaise reponse
 *
 * Total : ~120 phrases reparties par contexte. Tout en francais, ton apero.
 */
object Commentary {

    // ============================================================
    //                   EXPLICATION
    // ============================================================

    fun buildExplanation(question: Question): String {
        if (question.explanation.isNotBlank()) return question.explanation

        val correctAnswer = question.answers.getOrElse(question.correctIndex) { "?" }
        val diffLabel = when (question.difficulty) {
            Difficulty.EASY -> "facile"
            Difficulty.MEDIUM -> "moyenne"
            Difficulty.HARD -> "difficile"
            Difficulty.EXPERT -> "expert"
        }
        return "Bonne réponse : $correctAnswer.\n" +
                "Catégorie : ${question.category} — niveau $diffLabel.\n" +
                "Tu sauras pour la prochaine fois 😉"
    }

    // ============================================================
    //                   COMMENTAIRE PRINCIPAL
    // ============================================================

    /**
     * Renvoie LE commentaire a afficher sous le resultat.
     * Priorite :
     *  1) Streak win/lose >= 2 → message de streak (plus dramatique)
     *  2) Sinon → message selon difficulte + bon/mauvais
     *
     * @param isCorrect      bonne reponse ou pas
     * @param difficulty     difficulte de la question
     * @param winStreak      nb de bonnes reponses d'affilee (incluant celle-ci si correcte)
     * @param loseStreak     nb de mauvaises reponses d'affilee (incluant celle-ci si fausse)
     */
    fun pickComment(
        isCorrect: Boolean,
        difficulty: Difficulty,
        winStreak: Int,
        loseStreak: Int
    ): String {
        // 1) Priorite : streak (win ou lose)
        if (isCorrect) {
            winStreakComment(winStreak)?.let { return it }
        } else {
            loseStreakComment(loseStreak)?.let { return it }
        }

        // 2) Difficulte x resultat
        val pool = if (isCorrect) {
            when (difficulty) {
                Difficulty.EASY    -> winEasy
                Difficulty.MEDIUM  -> winMedium
                Difficulty.HARD    -> winHard
                Difficulty.EXPERT  -> winExpert
            }
        } else {
            when (difficulty) {
                Difficulty.EASY    -> loseEasy
                Difficulty.MEDIUM  -> loseMedium
                Difficulty.HARD    -> loseHard
                Difficulty.EXPERT  -> loseExpert
            }
        }
        return pool.random()
    }

    // ============================================================
    //          BONNES REPONSES PAR DIFFICULTE (~60)
    // ============================================================

    /** EASY + correct → on relativise, c'etait facile */
    private val winEasy = listOf(
        "👌 Tu m'étonnes, c'était offert.",
        "🥱 Bah... oui. C'était pas non plus la NASA.",
        "✅ Bonne réponse, mais bon, t'as mérité quoi, un sourire ?",
        "🍼 Niveau bébé, mais bon ça compte.",
        "🎯 Easy money. Très très easy.",
        "😂 T'as eu chaud sur celle-là, hein ?",
        "🤡 Si t'avais raté ça, on arrêtait le quiz.",
        "🏖️ Tranquille à la plage.",
        "🐢 Même une tortue aurait trouvé.",
        "📚 Niveau primaire validé, bravo champion.",
        "🤷 Ouais bon, fallait pas non plus se louper.",
        "🍩 Une rosette, c'est tout ce que tu auras.",
        "👏 Allez, on applaudit poliment.",
        "💤 Continue, ça va se corser.",
        "😏 T'as l'air content, c'est mignon."
    )

    /** MEDIUM + correct → encouragement standard */
    private val winMedium = listOf(
        "💪 Solide, on avance bien.",
        "🎯 Pile dans le mille.",
        "🧠 Tu connais ton dossier.",
        "✨ Joli coup, ça commence à être intéressant.",
        "👍 Très correct, on continue.",
        "🔥 Allez, tu chauffes.",
        "💯 Bonne tête, bonne réponse.",
        "🚀 Ça décolle gentiment.",
        "🎓 Niveau lycée passé haut la main.",
        "👑 Belle prestation, on note.",
        "🎲 Bien joué, c'était pas évident.",
        "✅ Validation officielle.",
        "🍀 Avec un peu de chance et beaucoup de neurones.",
        "🦾 La machine tourne.",
        "📈 La courbe est en train de monter."
    )

    /** HARD + correct → vraies felicitations */
    private val winHard = listOf(
        "🏆 Très très fort. Personne avait sur celle-là.",
        "🤯 Mais comment tu sais ça toi ?!",
        "🎓 T'as fait des études ou quoi ?",
        "🔥 Niveau pro, on est admiratifs.",
        "👑 La table salue le maître.",
        "🧠 Tu caches une encyclopédie sous le canapé ?",
        "💎 Réponse en diamant.",
        "🚀 Direct dans la stratosphère.",
        "🎯 Tir de sniper, BAM !",
        "⚡ Le cerveau fait des étincelles.",
        "👏 Hommage. Salut très bas.",
        "🦅 Vue d'aigle, réflexes de ninja.",
        "💥 BOOM. Question pulvérisée.",
        "🌟 Étoile filante du quiz.",
        "🏅 Médaille d'or virtuelle décernée."
    )

    /** EXPERT + correct → compliments appuyes */
    private val winExpert = listOf(
        "🐐 EXPERT RÉUSSI. T'es une légende vivante.",
        "🤖 Sûr que t'es pas une IA cachée dans le canapé ?",
        "👽 Niveau extraterrestre. On t'examine.",
        "🌌 Tu maîtrises l'univers connu, dis donc.",
        "🏆 ROI DU SAVOIR. On s'incline.",
        "🧙 Magie pure, sorcier des questions.",
        "⚡ Cerveau de la taille d'une planète.",
        "🥇 PERSONNE n'aurait trouvé. Toi si. Mythe.",
        "💀 Les autres joueurs envisagent de quitter le jeu.",
        "🚀 Niveau Einstein bourré de café.",
        "👑 Couronnement officiel, le sceptre est à toi.",
        "🦾 Tu pulvérises la difficulté EXPERT comme un robot.",
        "🌟 Ce moment va être raconté aux générations futures.",
        "🔮 T'as un don, c'est sûr.",
        "📚 T'as avalé un dictionnaire en entier ?"
    )

    // ============================================================
    //          MAUVAISES REPONSES PAR DIFFICULTE (~60)
    // ============================================================

    /** EASY + faux → moqueries franches, c'etait offert */
    private val loseEasy = listOf(
        "🤡 NON. C'était FACILE. Genre VRAIMENT facile.",
        "💀 Comment tu fais pour louper ça ?!",
        "🤣 Même mon grille-pain savait.",
        "🍼 Mode bébé raté, on retourne en couches.",
        "🐢 Une tortue aurait fait mieux. Réellement.",
        "🤷 Bon... on va dire que t'es fatigué.",
        "🪦 RIP la culture générale.",
        "🎪 Le cirque te recrute, dis-moi.",
        "😂 On va s'en remettre, mais avec difficulté.",
        "🚨 Alerte cerveau en panne.",
        "🥲 Tu m'as déçu là, vraiment.",
        "👻 T'es absent ou quoi ?",
        "🤖 Même un random aurait pas fait ça.",
        "🍷 Allez, je crois que t'as besoin de boire.",
        "🦥 Mode paresseux activé."
    )

    /** MEDIUM + faux → taquineries */
    private val loseMedium = listOf(
        "😬 Aïe, fallait y réfléchir un peu plus.",
        "🤔 T'étais à 2 doigts, ou pas du tout.",
        "🙃 La réponse t'est passée au-dessus de la tête.",
        "💨 Trou d'air, ça arrive.",
        "🫠 Pas dramatique, mais bon.",
        "🐌 Le cerveau a buggé sur celle-là.",
        "🤷 On a tous nos jours sans.",
        "📉 Petit creux dans la perf.",
        "😅 Allez, on oublie celle-là.",
        "🎲 La chance n'était pas de ton côté.",
        "🌫️ Brouillard mental détecté.",
        "🪦 Cette réponse est morte avec toi.",
        "👀 T'as lu la question en diagonale, je le sens.",
        "🥴 On va dire que c'est l'apéro.",
        "🍹 Trop de cocktails, peut-être ?"
    )

    /** HARD + faux → consolation, c'etait tendu */
    private val loseHard = listOf(
        "😤 Bon, c'était pas évident, on va pas s'énerver.",
        "🤓 Cette question demandait du niveau, ne te sens pas mal.",
        "💪 Au moins t'as essayé, c'est ça qui compte.",
        "🎯 Vraiment proche, presque.",
        "🧠 Le neurone a flanché au mauvais moment.",
        "🪦 Ci-gît ta bonne réponse, partie trop tôt.",
        "🤔 Faudra retenir ça pour la prochaine fois.",
        "😅 Difficile celle-là, t'inquiète pas.",
        "📚 Direction bibliothèque pour réviser.",
        "🌪️ Question piège qui a fait des dégâts.",
        "🥲 On était pas loin, on était pas loin..."
    )

    /** EXPERT + faux → consolation totale */
    private val loseExpert = listOf(
        "🫡 Question impossible, ne pleure pas.",
        "💎 Personne attendait que tu trouves ça franchement.",
        "🤝 Honneur à ta tentative sur du EXPERT.",
        "🎓 C'est du niveau doctorat, pardonne-toi.",
        "🌌 Cette réponse était cachée dans une autre galaxie.",
        "👽 Y'a que les aliens qui savaient.",
        "🤷 T'as osé le EXPERT, déjà respect.",
        "🧙 Faudrait un sorcier pour ça.",
        "📖 La réponse était dans un livre que personne n'a lu.",
        "🪦 Repose en paix, brave neurone."
    )

    // ============================================================
    //                   STREAKS
    // ============================================================

    fun winStreakComment(streak: Int): String? {
        if (streak < 2) return null
        val pool = when {
            streak >= 10 -> winStreak10
            streak >= 7  -> winStreak7
            streak >= 5  -> winStreak5
            streak >= 3  -> winStreak3
            else         -> winStreak2
        }
        return pool.random()
    }

    fun loseStreakComment(loseStreak: Int): String? {
        if (loseStreak < 2) return null
        val pool = when {
            loseStreak >= 6 -> loseStreak6
            loseStreak >= 4 -> loseStreak4
            loseStreak >= 3 -> loseStreak3
            else            -> loseStreak2
        }
        return pool.random()
    }

    private val winStreak2 = listOf(
        "🔥 Deux d'affilée, ça commence à sentir bon...",
        "✨ Et de 2 ! Tu chauffes la machine.",
        "👏 Combo lancé, on continue ?",
        "🎯 Deux sur deux, c'est pas du hasard."
    )

    private val winStreak3 = listOf(
        "🔥 Trois de suite ! Le cerveau tourne à plein régime.",
        "🚀 Triple combo, t'as mangé un dico au petit-déj ?",
        "💪 Trois bonnes réponses, les autres commencent à transpirer.",
        "🎩 Le chapeau du quizmaster te va bien.",
        "⚡ Triple impact, t'es chaud bouillant !"
    )

    private val winStreak5 = listOf(
        "🌟 5 d'affilée ! On appelle Wikipédia pour vérifier que t'as pas le wifi.",
        "🧠 Cinq sur cinq, ton neurone fait des heures sup'.",
        "🔥 5 questions, 5 victoires. Les autres pleurent en silence.",
        "🏆 Combo x5 ! Tu joues pas, tu domines.",
        "👑 Cinq bonnes réponses : tu rentres dans la légende du salon."
    )

    private val winStreak7 = listOf(
        "🤯 7 d'affilée ! Personne n'osera t'inviter au prochain quiz.",
        "🦾 Sept réponses justes. T'es sûr que t'es pas dopé ?",
        "💎 Combo x7 — niveau ChatGPT bourré de café.",
        "🚀 7 sur 7, t'as ouvert un portail vers la connaissance.",
        "🔥 Sept de suite : tes potes envisagent de cacher leur téléphone."
    )

    private val winStreak10 = listOf(
        "🐐 DIX D'AFFILÉE. T'es plus un joueur, t'es une légende urbaine.",
        "🤖 Soit t'es un génie, soit t'es un robot. On hésite.",
        "👽 10 sur 10. Ils vont retirer ton nom du dictionnaire pour pas que tu triches.",
        "🏆 STREAK x10 ! On t'érige une statue dans le salon.",
        "💀 Dix de suite. Les autres joueurs pensent à arrêter le quiz et boire."
    )

    private val loseStreak2 = listOf(
        "😬 Deux ratées de suite, ça pique un peu...",
        "🫠 Allez, on respire et on repart.",
        "🤔 Deux fois faux, c'est pas grave, t'es échauffé.",
        "💨 Petit trou d'air, ça arrive aux meilleurs."
    )

    private val loseStreak3 = listOf(
        "😅 Trois ratées d'affilée, t'as pris quoi au petit-déj ?",
        "🪦 RIP ton cerveau, on lance les recherches.",
        "🐢 Trois fois faux, t'es en mode économie d'énergie ?",
        "🤡 Le cirque appelle, ils veulent te récupérer.",
        "🥲 Trois loupés... on va dire que c'est de la malchance."
    )

    private val loseStreak4 = listOf(
        "💀 Quatre ratées. Tu joues à l'envers ou quoi ?",
        "🚨 Alerte rouge cerveau, redémarrage requis.",
        "🤣 Quatre fois faux : les autres ont arrêté de compter.",
        "🍷 Quatre loupés... c'est peut-être l'heure de boire un coup.",
        "🐌 Combo défaite x4, t'as perdu ta carte mémoire ?"
    )

    private val loseStreak6 = listOf(
        "💀💀💀 SIX RATÉES. T'as battu un record. Pas le bon, mais quand même.",
        "🌊 Combo défaite x6 : tout le monde trinque, même le chien.",
        "👻 T'es maudit. On appelle un prêtre.",
        "🎪 Six de suite. Le cirque t'embauche en CDI.",
        "🤖 À ce niveau, même un random aurait fait mieux."
    )
}
