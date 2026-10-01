# 🎨 Prompts Leonardo pour CLQ v11

Tous les prompts pour habiller le jeu. Logo non inclus (gardé tel quel).

---

## ⚙️ Réglages Leonardo communs

| Type d'image | Modèle recommandé | Taille | Style preset |
|---|---|---|---|
| Arènes (backgrounds) | **Lucid Realism** ou **Phoenix** | 1080 × 1920 | Cinematic |
| Avatars personnages | **3D Animation Style** | 1024 × 1024 | Default |
| Icônes / glyphes | **Leonardo Diffusion XL** | 512 × 512 | Sleek |
| BG spéciaux (Glou, podium…) | **Phoenix** | 1080 × 1920 | Cinematic |

**Negative prompt universel** (à coller pour tous) :
```
text, watermark, logo, signature, blurry, low quality, distorted, ugly, cropped, frame, border, words, letters, numbers
```

---

# 🏟️ ARÈNES (10 backgrounds catégorie)

> Format : **1080 × 1920 px JPG**
> Destination : `app/src/main/res/drawable/cat_<nom>.jpg`
> Style : sombre, cinematic, vignette, lisibilité du texte blanc

## 1. Cinéma — `cat_cinema.jpg`
```
Dark cinematic theater arena, vintage film projector beams cutting through fog,
red velvet curtains in background, golden movie reels floating, art deco patterns,
deep crimson and gold lighting, atmospheric depth, vignette, 9:16 portrait,
moody and dramatic, ultra detailed, no text
```

## 2. Culture — `cat_culture.jpg`
```
Dark museum gallery arena, ancient Greek statues with subtle blue rim lighting,
floating books and scrolls, marble columns fading into shadow, parchment textures,
deep navy and bronze tones, atmospheric mist, cinematic vignette, 9:16 portrait,
intellectual elegance, ultra detailed, no text
```

## 3. Gastronomie — `cat_gastronomie.jpg`
```
Dark professional kitchen arena, glowing copper pots and pans, scattered spices
mid-air, steam rising, candlelit ambiance, rustic wooden surfaces, fire embers,
warm orange and deep brown tones, top-down dramatic lighting, vignette,
9:16 portrait, gourmet atmosphere, ultra detailed, no text
```

## 4. Géographie — `cat_geographie.jpg`
```
Dark cosmic arena with floating Earth globe, translucent world map overlay,
constellation lines connecting continents, vintage compass and parchment maps
floating, deep space blue and warm amber accents, dramatic lighting, vignette,
9:16 portrait, exploratory atmosphere, ultra detailed, no text
```

## 5. Histoire — `cat_histoire.jpg`
```
Dark medieval arena with ancient stone walls, floating hourglass and parchment
scrolls, weathered banners, candlelit torches casting shadows, antique armor
silhouettes, deep sepia and crimson tones, atmospheric dust particles, vignette,
9:16 portrait, timeless and epic, ultra detailed, no text
```

## 6. Musique — `cat_musique.jpg`
```
Dark concert arena with floating glowing music notes, neon piano keys cascading,
sound wave visualizations, smoke and lasers, vintage microphone in foreground,
deep purple and electric blue tones, dramatic stage lighting, vignette,
9:16 portrait, electric atmosphere, ultra detailed, no text
```

## 7. Nature — `cat_nature.jpg`
```
Dark mystical forest arena at twilight, bioluminescent plants and mushrooms,
floating leaves, glowing fireflies, mist between ancient trees, moss-covered
rocks, deep emerald green and teal accents, mysterious lighting, vignette,
9:16 portrait, enchanted atmosphere, ultra detailed, no text
```

## 8. Science — `cat_science.jpg`
```
Dark laboratory arena, glowing chemistry beakers and DNA helix, floating
mathematical equations and particle physics symbols, holographic atom models,
electric blue and cyan light streaks, retrofuturistic instruments, vignette,
9:16 portrait, intellectual and futuristic, ultra detailed, no text
```

## 9. Sport — `cat_sport.jpg`
```
Dark stadium arena at night, dramatic spotlight beams cutting through smoke,
floating sports equipment silhouettes (ball, trophy, whistle), bleachers fading
into darkness, deep emerald field and gold accents, electric energy particles,
vignette, 9:16 portrait, competitive atmosphere, ultra detailed, no text
```

## 10. Tech — `cat_tech.jpg`
```
Dark cyber arena with floating circuit boards and holographic interfaces, neon
grid floor extending to horizon, data streams cascading, electric blue and
magenta cyberpunk lighting, glowing motherboard textures, vignette, 9:16 portrait,
high-tech atmosphere, ultra detailed, no text
```

---

# 👤 AVATARS (15 nouveaux complémentaires)

> Format : **1024 × 1024 px JPG ou PNG**
> Destination : `app/src/main/res/drawable/avatar_<nom>.jpg`
> Style : mascotte stylisée 3D, fond gris-bleu ou neutre légèrement texturé, cohérent avec les 21 avatars existants

**Préfixe commun à coller devant CHAQUE avatar** :
```
3D animated character portrait, full body or chest-up, centered composition,
stylized cute mascot proportions, dramatic studio rim lighting, neutral dark
gradient background with subtle texture, ultra detailed, no text, no watermark
```

## 11. `avatar_archeologist.jpg`
```
adventurous archeologist with leather hat and brown jacket, holding ancient artifact,
warm earthy tones, Indiana Jones inspired, slight grin, dust particles
```

## 12. `avatar_artist.jpg`
```
bohemian artist with paint-splattered apron and beret, holding brush, palette in
hand, vibrant rainbow paint splashes around, joyful expression
```

## 13. `avatar_chef_master.jpg`
```
elite master chef with tall white toque and stern expression, holding flaming pan,
golden cooking sparks, professional kitchen vibe, gold and red accents
```

## 14. `avatar_cyborg.jpg`
```
half-human half-cybernetic warrior, glowing electric blue circuit lines on skin,
chrome metallic limb, futuristic visor over one eye, dark techno background tone
```

## 15. `avatar_doctor.jpg`
```
friendly cartoon doctor with white coat, stethoscope around neck, holding glowing
medical clipboard, soft cyan tones, kind smile
```

## 16. `avatar_explorer.jpg`
```
arctic explorer with fur-lined hood, frost on goggles, breath visible, blue and
white icy tones, rugged determined face
```

## 17. `avatar_gamer.jpg`
```
young gamer with neon RGB headset, controller in hand, glowing screens reflecting
on face, purple and pink neon lighting, playful smirk
```

## 18. `avatar_magician.jpg`
```
mysterious magician with top hat and red cape, glowing magic cards floating around,
golden sparkles, dramatic purple and gold lighting, slight smirk
```

## 19. `avatar_mecha.jpg`
```
giant mecha pilot character in cockpit suit, helmet with glowing visor, mechanical
armor pieces, orange and steel grey tones, heroic stance
```

## 20. `avatar_mermaid.jpg`
```
ocean mermaid character with iridescent scales, flowing blue-teal hair, shells
in hair, soft underwater glow, bubbles around, ethereal beauty
```

## 21. `avatar_pilot.jpg`
```
fighter jet pilot with leather helmet and aviator goggles, scarf flowing, sky-blue
and silver tones, confident smile, top-gun vibe
```

## 22. `avatar_priestess.jpg`
```
mystical priestess with golden tiara and white robes, glowing magical aura,
divine soft yellow lighting, serene expression, sacred symbols floating
```

## 23. `avatar_steampunk.jpg`
```
victorian steampunk inventor with brass goggles, mechanical arm, gear-covered vest,
copper and bronze tones, holding glowing invention, mischievous grin
```

## 24. `avatar_vampire.jpg`
```
elegant vampire noble with crimson cloak and pale skin, glowing red eyes, fangs
visible in slight smile, gothic castle backdrop hint, deep purple and red tones
```

## 25. `avatar_yeti.jpg`
```
fluffy mountain yeti character with friendly big eyes, white fur with blue tints,
icy crystals on shoulders, cute and approachable, snow particles around
```

---

# 🎯 ICÔNES DE MODES (3 icônes)

> Format : **512 × 512 px PNG fond transparent**
> Destination : `app/src/main/res/drawable/ic_mode_<nom>.png`
> Style : glyphe coloré 3D, lisible petit, fond transparent

## 26. `ic_mode_duo.png`
```
3D glossy game icon, two glowing green orbs side by side, vibrant emerald green
gradient, soft inner glow, clean modern design, transparent background, centered,
no text, app icon style, ultra detailed
```

## 27. `ic_mode_carre.png`
```
3D glossy game icon, four glowing yellow squares arranged in 2x2 grid pattern,
vibrant gold and amber gradient, soft inner glow, clean modern design,
transparent background, centered, no text, app icon style, ultra detailed
```

## 28. `ic_mode_cash.png`
```
3D glossy game icon, glowing red keyboard typing icon with cursor, vibrant crimson
gradient, soft electric glow, clean modern design, transparent background,
centered, no text, app icon style, ultra detailed
```

---

# 💀 ICÔNES DE DIFFICULTÉ (4 icônes)

> Format : **512 × 512 px PNG fond transparent**
> Destination : `app/src/main/res/drawable/ic_diff_<nom>.png`

## 29. `ic_diff_easy.png`
```
3D glossy game icon, glowing green leaf or sprout symbol, vibrant fresh green
gradient, soft inner glow, friendly approachable design, transparent background,
centered, no text, app icon style, ultra detailed
```

## 30. `ic_diff_medium.png`
```
3D glossy game icon, glowing yellow lightning bolt or flame, vibrant amber gold
gradient, soft electric glow, dynamic energetic design, transparent background,
centered, no text, app icon style, ultra detailed
```

## 31. `ic_diff_hard.png`
```
3D glossy game icon, glowing red flame skull symbol, vibrant crimson and orange
gradient, intense aggressive glow, dramatic design, transparent background,
centered, no text, app icon style, ultra detailed
```

## 32. `ic_diff_expert.png`
```
3D glossy game icon, glowing purple skull with crown, ornate dark royal purple
gradient with gold accents, eerie magical glow, legendary design, transparent
background, centered, no text, app icon style, ultra detailed
```

---

# 🎉 BACKGROUNDS SPÉCIAUX (4 BG)

> Format : **1080 × 1920 px JPG**
> Destination : `app/src/main/res/drawable/`

## 33. `bg_glou_mode.jpg` (mode Glou — apéro)
```
Dark party arena background, floating beer glasses and cocktail bottles, neon
liquid splashes, drunken festive vibe, deep amber gold and ruby red lighting,
party fog and light beams, vignette, 9:16 portrait, festive but moody, ultra
detailed, no text
```

## 34. `bg_results.jpg` (écran de résultats)
```
Dark celebration arena background, falling golden confetti and trophy silhouettes,
spotlight beams from above, soft bokeh particles, deep navy blue with gold
accents, victorious atmosphere, vignette, 9:16 portrait, triumphant but elegant,
ultra detailed, no text
```

## 35. `bg_podium.jpg` (top 3 du classement)
```
Dark stadium podium arena, three pedestals fading into shadow with subtle glow,
golden laurel wreaths floating, falling confetti, dramatic spotlight beams,
deep purple and gold tones, championship atmosphere, vignette, 9:16 portrait,
epic and prestigious, ultra detailed, no text
```

## 36. `bg_sudden_death.jpg` (mort subite tiebreaker)
```
Dark intense duel arena, lightning crackling in stormy sky, two opposing energy
auras clashing in center, electric particles, deep blood red and electric blue
contrasting lighting, dramatic atmosphere, vignette, 9:16 portrait, tense and
dramatic, ultra detailed, no text
```

---

# 📦 RÉCAP

| Catégorie | Nombre | Format | Total taille estimée |
|---|---|---|---|
| Arènes catégories | 10 | 1080×1920 JPG | ~1.5 Mo |
| Nouveaux avatars | 15 | 1024×1024 JPG | ~1.5 Mo |
| Icônes modes | 3 | 512×512 PNG | ~150 Ko |
| Icônes difficulté | 4 | 512×512 PNG | ~200 Ko |
| BG spéciaux | 4 | 1080×1920 JPG | ~600 Ko |
| **TOTAL** | **36 images** | — | **~4 Mo** |

---

# 🚀 Workflow conseillé

1. Génère **par paquet de 4** dans Leonardo (souvent 4 variations gratuites par run)
2. Sélectionne la meilleure de chaque pack et télécharge en haute résolution
3. Compresse via **squoosh.app** (réduit JPG ~70 %, PNG ~50 % sans perte visible)
4. Renomme avec exactement le nom de fichier indiqué (`avatar_xxx.jpg`, `cat_xxx.jpg`, etc.)
5. Glisse dans `app/src/main/res/drawable/` (Android Studio le détecte direct)
6. Pour les nouveaux avatars : dis-moi quand t'as les fichiers, je rajoute leurs IDs dans `AvatarManager` et `ImageAssets` pour qu'ils apparaissent dans le sélecteur

---

# 💡 Conseils prompt (si besoin de variantes)

- **"more dramatic lighting"** → arène plus immersive
- **"less detailed background"** → si le BG mange l'attention sur le texte
- **"warm amber tones"** ↔ **"cool blue tones"** → pour matcher l'ambiance désirée
- **"slightly stylized cartoon"** → si Leonardo te sort du trop réaliste pour les avatars
- **"vignette and depth of field"** → pour cadrer le regard sur le centre

Si une catégorie te plait pas, dis-moi laquelle et je reprompt.
