# install_images.ps1
# =====================
# Renomme les 36 images du dossier _incoming_images/ et les copie dans
# app/src/main/res/drawable/ avec les bons noms attendus par le code Android.
#
# Usage :
#   cd D:\Prometheus\Projects\ChampionLeagueQuizz\CLQ_v12\scripts
#   .\install_images.ps1

$ErrorActionPreference = "Stop"

$ROOT     = Split-Path -Parent $PSScriptRoot
$INCOMING = "$ROOT\_incoming_images"
$DRAWABLE = "$ROOT\app\src\main\res\drawable"

# Mapping : source ChatGPT -> nom final (sans extension, .png conserve)
$mapping = @{
    # === ARENES (10) ===
    "ChatGPT Image 30 avr. 2026, 12_22_10 (1).png"  = "cat_cinema.png"
    "ChatGPT Image 30 avr. 2026, 12_22_10 (2).png"  = "cat_culture.png"
    "ChatGPT Image 30 avr. 2026, 12_22_10 (3).png"  = "cat_gastronomie.png"
    "ChatGPT Image 30 avr. 2026, 12_22_10 (4).png"  = "cat_geographie.png"
    "ChatGPT Image 30 avr. 2026, 12_22_11 (5).png"  = "cat_histoire.png"
    "ChatGPT Image 30 avr. 2026, 12_22_11 (6).png"  = "cat_musique.png"
    "ChatGPT Image 30 avr. 2026, 12_22_11 (7).png"  = "cat_nature.png"
    "ChatGPT Image 30 avr. 2026, 12_22_11 (8).png"  = "cat_science.png"
    "ChatGPT Image 30 avr. 2026, 12_22_12 (9).png"  = "cat_sport.png"
    "ChatGPT Image 30 avr. 2026, 12_22_12 (10).png" = "cat_tech.png"

    # === BG SPECIAUX (4) ===
    "ChatGPT Image 30 avr. 2026, 12_26_18 (1).png"  = "bg_glou_mode.png"
    "ChatGPT Image 30 avr. 2026, 12_26_19 (2).png"  = "bg_results.png"
    "ChatGPT Image 30 avr. 2026, 12_26_19 (3).png"  = "bg_podium.png"
    "ChatGPT Image 30 avr. 2026, 12_26_19 (4).png"  = "bg_sudden_death.png"

    # === ICONES MODES (3) ===
    "ChatGPT Image 30 avr. 2026, 12_26_32 (1).png"  = "ic_mode_duo.png"
    "ChatGPT Image 30 avr. 2026, 12_26_32 (2).png"  = "ic_mode_carre.png"
    "ChatGPT Image 30 avr. 2026, 12_26_33 (3).png"  = "ic_mode_cash.png"

    # === ICONES DIFFICULTE (4) ===
    "ChatGPT Image 30 avr. 2026, 12_26_33 (4).png"  = "ic_diff_easy.png"
    "ChatGPT Image 30 avr. 2026, 12_26_33 (5).png"  = "ic_diff_medium.png"
    "ChatGPT Image 30 avr. 2026, 12_26_34 (6).png"  = "ic_diff_hard.png"
    "ChatGPT Image 30 avr. 2026, 12_26_34 (7).png"  = "ic_diff_expert.png"

    # === AVATARS (15) ===
    "ChatGPT Image 30 avr. 2026, 12_26_52 (1).png"  = "avatar_archeologist.png"
    "ChatGPT Image 30 avr. 2026, 12_26_52 (2).png"  = "avatar_artist.png"
    "ChatGPT Image 30 avr. 2026, 12_26_53 (3).png"  = "avatar_chef_master.png"
    "ChatGPT Image 30 avr. 2026, 12_26_53 (4).png"  = "avatar_cyborg.png"
    "ChatGPT Image 30 avr. 2026, 12_26_53 (5).png"  = "avatar_doctor.png"
    "ChatGPT Image 30 avr. 2026, 12_26_54 (6).png"  = "avatar_explorer.png"
    "ChatGPT Image 30 avr. 2026, 12_26_54 (7).png"  = "avatar_gamer.png"
    "ChatGPT Image 30 avr. 2026, 12_26_54 (8).png"  = "avatar_magician.png"
    "ChatGPT Image 30 avr. 2026, 12_26_57 (9).png"  = "avatar_mecha.png"
    "ChatGPT Image 30 avr. 2026, 12_26_58 (10).png" = "avatar_mermaid.png"
    "ChatGPT Image 30 avr. 2026, 12_29_54 (1).png"  = "avatar_pilot.png"
    "ChatGPT Image 30 avr. 2026, 12_29_55 (2).png"  = "avatar_priestess.png"
    "ChatGPT Image 30 avr. 2026, 12_29_55 (3).png"  = "avatar_steampunk.png"
    "ChatGPT Image 30 avr. 2026, 12_29_55 (4).png"  = "avatar_vampire.png"
    "ChatGPT Image 30 avr. 2026, 12_29_56 (5).png"  = "avatar_yeti.png"
}

Write-Host "=== INSTALL IMAGES ==="
Write-Host "Incoming : $INCOMING"
Write-Host "Drawable : $DRAWABLE"
Write-Host ""

# Verifie qu'on a tout
$missing = @()
foreach ($src in $mapping.Keys) {
    if (-not (Test-Path "$INCOMING\$src")) {
        $missing += $src
    }
}
if ($missing.Count -gt 0) {
    Write-Host "[ERREUR] Images manquantes dans $INCOMING :" -ForegroundColor Red
    $missing | ForEach-Object { Write-Host "   - $_" }
    exit 1
}

# Supprime les anciennes versions .jpg des categories qu'on remplace en .png
# (Android refuse 2 ressources avec le meme nom mais des extensions differentes)
$catFiles = @("cat_cinema", "cat_culture", "cat_gastronomie", "cat_geographie",
              "cat_histoire", "cat_musique", "cat_nature", "cat_science",
              "cat_sport", "cat_tech")

Write-Host "--- Suppression des anciens cat_*.jpg ---"
foreach ($cat in $catFiles) {
    $oldJpg = "$DRAWABLE\$cat.jpg"
    if (Test-Path $oldJpg) {
        Remove-Item $oldJpg
        Write-Host "  [SUPPR] $cat.jpg"
    }
}

# Copie + renomme
Write-Host ""
Write-Host "--- Copie des 36 images ---"
$count = 0
foreach ($src in $mapping.Keys | Sort-Object) {
    $dst = $mapping[$src]
    Copy-Item -Path "$INCOMING\$src" -Destination "$DRAWABLE\$dst" -Force
    $count++
    Write-Host ("  [{0,2}/36] {1}" -f $count, $dst)
}

Write-Host ""
Write-Host "=== TERMINE ===" -ForegroundColor Green
Write-Host "$count images installees dans $DRAWABLE"
Write-Host ""
Write-Host "Etape suivante : compile l'APK"
Write-Host "  cd $ROOT"
Write-Host "  .\gradlew.bat assembleDebug"
