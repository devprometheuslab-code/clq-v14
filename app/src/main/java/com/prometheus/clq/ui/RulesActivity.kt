package com.prometheus.clq.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prometheus.clq.databinding.ActivityRulesBinding

class RulesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRulesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRulesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvRules.text = buildRulesText()
        binding.btnBack.setOnClickListener { GameJuice.vibrateTap(this); finish() }
    }

    private fun buildRulesText(): String = """
CHAMPION LEAGUE QUIZZ
"Technology from gods" — Prometheus Technology

━━━━━━━━━━━━━━━━━━━━━━━━

PRINCIPE
Chaque joueur répond à son tour à une question.
Le twist : tu vois la question AVANT de choisir ton mode de réponse !

━━━ MODES DE RÉPONSE ━━━

🟢 DUO → 2 propositions au choix
   Sécurisé mais peu de points.

🟡 CARRÉ → 4 propositions au choix
   Risque moyen, points intermédiaires.

🔴 CASH → Réponse libre au clavier
   Ultra risqué mais maximum de points !
   Le système tolère les fautes de frappe et accepte les synonymes.

━━━ NIVEAUX DE DIFFICULTÉ ━━━

Choisis ta difficulté à chaque tour :
🟢 Facile → Questions simples, peu de points
🟡 Moyen → Bon équilibre risque/récompense
🔴 Difficile → Questions corsées, plus de points
💀 Expert → Pour les vrais champions !

Barème (points gagnés · malus si faux) :
  🟢 Facile : Duo +1 · Carré +2 · Cash +3 · sans risque
  🟡 Moyen : Duo +2 · Carré +3 · Cash +5 · faux −1
  🔴 Difficile : Duo +3 · Carré +5 · Cash +8 · faux −2
  💀 Expert : Duo +5 · Carré +8 · Cash +12 · faux −3

━━━ LES 2 MODES DE JEU ━━━

🏆 CLASSIQUE
Le mode standard. Chaque joueur répond à tour de rôle.
Celui qui a le plus de points à la fin gagne.
En cas d’égalité, la victoire est partagée.
Parfait pour découvrir le jeu !

💀 GLOU
Le mode fun et chaotique ! (Multijoueur recommandé)
Chaque joueur a 30 Points de Vie (PV).
Erreur → tu perds des PV.
Réussite → tu infliges des dégâts aux adversaires !
Dernier joueur debout = vainqueur !
À la limite de questions : survivants, puis PV, puis points.

Événements aléatoires en Glou :
  💥 Apocalypse → Tous perdent 10 PV
  ⚡ Coup Triple → Un adversaire perd 9 PV
  💚 Dernier Souffle → Le plus faible récupère 5 PV
  🛡️ Bunker → +5 PV de protection
  💊 Soin → +3 PV

━━━ BONUS & POUVOIRS ━━━

Chaque joueur dispose de ses propres bonus utilisables pendant la partie.
En solo, seuls les bonus personnels sont disponibles.

BONUS UNIVERSELS (tous les modes) :
  🔄 Switch → Change la question (même difficulté)
  ❌ Supprimer → Retire une mauvaise réponse (en Carré)
  x2 Double → Double les points de la question
  🚀 Boost → x1.5 sur ta prochaine bonne réponse
  ⛓️ Chaîne → Protège ton streak une fois si tu te trompes
  🎰 Quitte ou Double → x3 si correct, x3 malus si faux !

BONUS FREEZE (tous les modes) :
  ❄️ Freeze → Met le chrono en pause 5 secondes

Astuce : appui long sur un bonus pour voir ce qu'il fait.

BONUS MULTIJOUEUR GLOU uniquement :
  🎯 Steal → Vole des points à l'adversaire en tête
  ⏱️ Sabotage → -5 secondes sur le timer du prochain joueur

━━━ ROUE MAGIQUE ━━━

🎡 En jouant, tu accumules des Wheel Points (WP).
Quand tu atteins un palier, tu débloques un SPIN !
La roue peut donner : bonus points, bonus temps, sorts spéciaux...

SORTS DE LA ROUE :
  👁️ Révélation → La bonne réponse est affichée
  ❄️ Gel du Timer → Temps infini pour une question
  🛡️ Bouclier → Protège des dégâts Glou

━━━ SÉRIE (STREAK) ━━━

Enchaîne les bonnes réponses pour des bonus croissants :
  🔥 x3 → Série de 3 : +2 points
  🔥🔥 x5 → Série de 5 : +5 points + confettis !
  💎 x7 → Série de 7 : +8 points
  👑 x10 → Série de 10 : +12 points + méga confettis !
  ✨ x15 → Série de 15 : +15 points

Attention : une mauvaise réponse casse ta série !
(Sauf si tu as activé le bonus ⛓️ Chaîne)

━━━ COMBO CATÉGORIE ━━━

Réponds correctement à plusieurs questions de la même catégorie d'affilée pour un multiplicateur bonus !

━━━ SOLO ━━━

En solo, tous les bonus personnels fonctionnent.
Les bonus qui ciblent un adversaire (Steal, Sabotage) sont désactivés.
Challenge-toi pour battre tes propres records !

━━━ MULTIJOUEUR ━━━

1 à 6 joueurs avec avatars personnalisés.
Chaque joueur choisit sa difficulté indépendamment.
Passez le téléphone entre chaque tour !

━━━ DES MILLIERS DE QUESTIONS ━━━

Des milliers de questions dans différentes catégories :
Sport, Science, Histoire, Géographie, Culture, Nature, Tech, Cinéma, Musique...
Les réponses sont mélangées à chaque partie, et le jeu évite de te reposer
une question déjà vue pendant la session.

Bonne chance, champion ! 🏆
    """.trimIndent()
}
