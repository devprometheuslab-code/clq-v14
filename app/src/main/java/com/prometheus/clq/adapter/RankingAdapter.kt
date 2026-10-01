package com.prometheus.clq.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.prometheus.clq.R
import com.prometheus.clq.data.AvatarManager
import com.prometheus.clq.model.Player

class RankingAdapter(
    private val players: List<Player>,
    private val accuracies: List<Int>,
    private val gameMode: String = "CLASSIC",
    private val winnerIds: Set<Int> = emptySet()
) : RecyclerView.Adapter<RankingAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvRank: TextView = view.findViewById(R.id.tvRank)
        val ivAvatar: ImageView = view.findViewById(R.id.ivRankAvatar)
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvScore: TextView = view.findViewById(R.id.tvScore)
        val tvStats: TextView = view.findViewById(R.id.tvStats)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ranking, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val p = players[position]
        val acc = accuracies.getOrElse(position) { 0 }

        val rank = players.indexOfFirst { it.score == p.score && (gameMode != "GLOU" || (it.pv == p.pv && it.isEliminated == p.isEliminated)) }
        holder.tvRank.text = when (rank) {
            0 -> "\uD83E\uDD47"  // Gold medal
            1 -> "\uD83E\uDD48"  // Silver
            2 -> "\uD83E\uDD49"  // Bronze
            else -> "#${rank + 1}"
        }

        // Avatar
        AvatarManager.loadAvatar(holder.ivAvatar, p.avatarId, circleCrop = true)

        holder.tvName.text = p.name
        holder.tvScore.text = if (gameMode == "GLOU") "${p.pv} PV" else "${p.score} pts"

        val statsBuilder = StringBuilder()
        statsBuilder.append("${p.correctAnswers}/${p.totalQuestionsAnswered} réponses")
        if (gameMode == "GLOU") statsBuilder.append(" · ${p.score} pts" + if (p.isEliminated) " · Éliminé" else "")
        statsBuilder.append(" • $acc%")
        if (p.bestStreak > 1) statsBuilder.append(" • Série: ${p.bestStreak}")
        if (p.cashUsed > 0) statsBuilder.append(" • Cash: ${p.cashCorrect}/${p.cashUsed}")
        holder.tvStats.text = statsBuilder.toString()

        val color = if (p.id in winnerIds) Color.parseColor("#FFD700") else Color.WHITE
        holder.tvScore.setTextColor(color)
        holder.tvName.setTextColor(color)
    }

    override fun getItemCount() = players.size
}
