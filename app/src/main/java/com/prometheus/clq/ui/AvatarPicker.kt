package com.prometheus.clq.ui

import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.prometheus.clq.R
import com.prometheus.clq.data.AvatarManager

object AvatarPicker {
    fun show(activity: AppCompatActivity, onPick: (String) -> Unit) {
        val view = activity.layoutInflater.inflate(R.layout.dialog_avatar_picker, null)
        val grid = view.findViewById<GridView>(R.id.gridAvatars)
        val avatars = AvatarManager.getAllAvatars()
        val dialog = AlertDialog.Builder(activity).setView(view).setNegativeButton("Annuler", null).create()
        grid.adapter = object : BaseAdapter() {
            override fun getCount() = avatars.size
            override fun getItem(position: Int) = avatars[position]
            override fun getItemId(position: Int) = position.toLong()
            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val item = convertView ?: activity.layoutInflater.inflate(R.layout.item_avatar_grid, parent, false)
                val avatar = avatars[position]
                AvatarManager.loadAvatar(item.findViewById(R.id.ivAvatarItem), avatar.id, circleCrop = true)
                item.findViewById<TextView>(R.id.tvAvatarName).text = avatar.name
                item.contentDescription = "Choisir l’avatar ${avatar.name}"
                return item
            }
        }
        grid.setOnItemClickListener { _, _, position, _ -> onPick(avatars[position].id); dialog.dismiss() }
        dialog.show()
    }
}
