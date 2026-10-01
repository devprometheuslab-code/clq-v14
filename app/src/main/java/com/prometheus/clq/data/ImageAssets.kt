package com.prometheus.clq.data

/**
 * URLs des images générées par Leonardo AI pour le CLQ.
 * Utiliser avec Coil ou Glide pour charger les images dans les vues.
 *
 * Génération: Leonardo Diffusion XL, style DYNAMIC, 06/04/2026
 */
object ImageAssets {

    const val LOGO = "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/b7169cdb-0a43-4071-b1f0-aaa3ff03332c/Leonardo_Kino_XL_Futuristic_neon_quiz_game_logo_bold_metallic_0.jpg"

    const val BACKGROUND = "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/7c7034fe-9d26-4a0b-8e0f-469eb3a2a2d4/Leonardo_Kino_XL_Dark_futuristic_mobile_app_background_deep_na_0.jpg"

    // Icônes de catégories
    private val categoryIcons = mapOf(
        "Science" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/881e12fc-5f79-4618-a05b-5e865617d521/Leonardo_Kino_XL_Glowing_neon_atom_icon_electric_blue_cyan_dar_0.jpg",
        "Sport" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/6595da9f-af12-41e3-b720-2f31f8a7e83f/Leonardo_Kino_XL_Glowing_neon_trophy_cup_icon_gold_orange_dark_0.jpg",
        "Cinéma" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/e1c924fb-6169-476c-9281-425a5ee4894b/Leonardo_Kino_XL_Glowing_neon_film_clapperboard_icon_magenta_p_0.jpg",
        "Musique" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/f0900baa-8776-446a-a8c0-3fb2cd5bbd58/Leonardo_Kino_XL_Glowing_neon_musical_note_icon_purple_violet_0.jpg",
        "Tech" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/5e0819e1-646b-4dee-aad2-3fa2282b1d2a/Leonardo_Kino_XL_Glowing_neon_circuit_chip_icon_electric_green_0.jpg",
        "Histoire" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/9e127633-ed68-42b0-b973-b4523dc7f7a8/Leonardo_Kino_XL_Glowing_neon_hourglass_icon_golden_amber_dark_0.jpg",
        "Géographie" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/b0fdb262-e622-410e-8d2e-ea87a072e146/Leonardo_Kino_XL_Glowing_neon_globe_earth_icon_cyan_teal_dark_0.jpg",
        "Nature" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/bc78f00c-d82f-4063-b4c0-28820bce8d9c/Leonardo_Kino_XL_Glowing_neon_leaf_icon_green_emerald_dark_bac_0.jpg",
        "Gastronomie" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/e207c94b-fedf-432e-885e-2878608c0506/Leonardo_Kino_XL_Glowing_neon_chef_hat_icon_warm_orange_red_da_0.jpg",
        "Culture" to "https://cdn.leonardo.ai/users/7410f404-8e99-4ba1-9c8d-a2f20fed75dc/generations/43b3da0c-9860-4eb3-8521-6851c7db54f7/Leonardo_Kino_XL_Glowing_neon_open_book_icon_warm_gold_white_d_0.jpg"
    )

    /**
     * Retourne l'URL de l'icône pour une catégorie donnée, ou null si pas d'icône.
     */
    fun getCategoryIcon(category: String): String? = categoryIcons[category]

    /**
     * Retourne toutes les catégories qui ont une icône.
     */
    fun getCategoriesWithIcons(): Set<String> = categoryIcons.keys
}
