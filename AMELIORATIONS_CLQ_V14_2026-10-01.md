# CLQ v14.2 — livraison du 1er octobre 2026

Dépôt public : https://github.com/devprometheuslab-code/clq-v14

Téléchargements : https://github.com/devprometheuslab-code/clq-v14/releases/tag/v14.2

## Fichiers livrés

| Fichier | Usage |
| --- | --- |
| `CLQ_v14_Android.apk` | Application Android principale, `com.prometheus.clq`, version `1.0.0-v14.2` / code 2 |
| `CLQ_v14_ameliore_test.apk` | Installation Android indépendante, `com.prometheus.clq.audit` |
| `CLQ_Windows_portable.zip` | Archive Windows à extraire ; contient l’exécutable, sa configuration et les instructions |
| `CLQ_Windows.exe` + `.exe.config` | Application Windows native |
| `SHA256SUMS.txt` | Empreintes des fichiers livrés |

Les fichiers sont déposés dans `Q:\projet\CLQ_v14`. Une sauvegarde des fichiers source remplacés est créée dans `_audit` avant leur mise à jour.

## Changements Android

La partie possède désormais un point de reprise écrit de manière atomique. L’accueil affiche un résumé et un bouton de reprise. Les informations conservées comprennent l’état du moteur, l’identité de la partie, le chrono et le Freeze, les choix Duo dans leur ordre, le texte Cash, les réponses révélées, les cibles Glou et l’état de la roue.

La pause propose de reprendre, de sauvegarder et de rentrer à l’accueil, ou d’abandonner avec confirmation. Une nouvelle partie demande confirmation avant de remplacer une sauvegarde. Après la fin du jeu, la sauvegarde disparaît une fois les profils et records enregistrés. La récompense de roue et une réponse déjà validée ne sont pas appliquées une seconde fois à la reprise.

La validation Cash utilise maintenant une comparaison normalisée avec les variantes connues et une tolérance limitée aux petites fautes. Elle refuse les simples fragments communs, plusieurs propositions concurrentes, les valeurs numériques différentes et les mauvaises réponses proposées. Les accents, ligatures et articles courants restent tolérés. La saisie est limitée à 256 caractères.

L’affichage des WP est actualisé dès la réponse. La musique peut redémarrer après recréation de l’écran tout en respectant le réglage de son. Les scripts Android produisent des fichiers clairement nommés et contrôlent les erreurs de compilation et de copie.

Deux clés API présentes en clair dans l’ancien générateur d’explications ont été retirées du code. Le script lit désormais `DEEPSEEK_API_KEY` et `ANTHROPIC_API_KEY` dans l’environnement. Les signatures, configurations locales, audits, sauvegardes et caches sont exclus du dépôt public. Les anciennes clés doivent être renouvelées auprès de leurs fournisseurs.

## Nouvelle version Windows

Application C# / WinForms en français, avec une interface sombre, un panneau défilant et la même banque jouable de 9 667 questions, 17 catégories et 201 groupes d’alias. La banque compressée est embarquée dans l’exécutable ; son export se fait depuis les sources Kotlin. Chaque question exportée possède un identifiant unique, même lorsque plusieurs fichiers source réutilisent un identifiant.

Le jeu permet de configurer 1 à 6 joueurs, un mode Classique ou Glou, une catégorie, 5 à 30 questions par joueur et un chrono de 10 à 60 secondes. Il propose les quatre difficultés, Duo / Carré / Cash, les bonus principaux, la roue, les dégâts et la survie Glou, les résultats et les records locaux. Le chrono se met en pause lorsque la fenêtre perd le focus. La fermeture et le retour à l’accueil sauvegardent la partie.

Il s’agit d’une adaptation PC : elle ne reprend pas tous les effets, avatars, profils, sorts et événements avancés de l’application Android. Les sauvegardes PC et Android sont distinctes, sans synchronisation entre appareils. Le fichier de configuration doit rester à côté de l’exécutable.

## Vérification

| Contrôle | Résultat |
| --- | --- |
| Compilation APK principal et variante de test | Réussite |
| Tests Android du moteur, des réponses Cash et du point de reprise | 37 tests, 0 échec |
| Analyse Android | 0 erreur, 649 avertissements |
| Moteur, banque et sauvegarde Windows | 55 contrôles réussis |
| Interface Windows, boutons réels et chrono | 15 contrôles réussis |
| Parcours Android sur émulateur dédié | Reprise après arrêt forcé, Duo, chrono, réponse révélée, WP, fin de partie, saisie Cash et abandon vérifiés |
| Contrôle visuel Windows | Accueil, configuration, question, réponse, résultats et petite fenêtre examinés |

Les tests Windows vérifient notamment les 12 combinaisons difficulté / mode de réponse, les alias et valeurs numériques, les réponses répétées, Glou et les classements, la sauvegarde sur disque, les récompenses uniques, une partie complète et les entrées de sauvegarde invalides.

L’APK livré est une compilation **debug signée avec une clé de développement**, installable directement. La clé privée de production existante n’est pas incluse dans le dépôt public. Les avertissements d’analyse Android restent une dette technique : cette livraison ne les corrige pas tous. La vérification Android utilise une installation de test distincte ; elle ne certifie pas une mise à jour d’une ancienne installation signée avec une autre clé.

## Références techniques

- [Gestion de l’état Android](https://developer.android.com/topic/libraries/architecture/saving-states)
- [Écriture atomique Android](https://developer.android.com/reference/android/util/AtomicFile)
- [Windows Forms avec .NET Framework](https://learn.microsoft.com/en-us/dotnet/desktop/winforms/overview/?view=netframeworkdesktop-4.8)
