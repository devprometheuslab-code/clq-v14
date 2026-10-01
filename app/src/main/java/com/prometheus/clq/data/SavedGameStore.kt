package com.prometheus.clq.data

import android.content.Context
import android.util.AtomicFile
import android.util.Log
import com.prometheus.clq.model.GameSessionSnapshot
import java.io.File
import java.io.IOException
import java.io.FileNotFoundException

/** One local game, written atomically so interrupted writes preserve the previous checkpoint. */
class SavedGameStore(context: Context) {
    private val file = AtomicFile(File(context.noBackupFilesDir, "current_game.json"))

    fun load(): GameSessionSnapshot? = synchronized(lock) {
        try {
            GameSessionSnapshot.decode(file.readFully().toString(Charsets.UTF_8))
        } catch (_: FileNotFoundException) {
            null
        } catch (error: Exception) {
            Log.w("SavedGameStore", "Unable to read game checkpoint", error)
            null
        }
    }

    fun save(saved: GameSessionSnapshot): Boolean = synchronized(lock) {
        var stream: java.io.FileOutputStream? = null
        try {
            val bytes = saved.encode().toByteArray(Charsets.UTF_8)
            stream = file.startWrite()
            stream.write(bytes)
            file.finishWrite(stream)
            true
        } catch (error: IOException) {
            file.failWrite(stream)
            Log.w("SavedGameStore", "Unable to save game checkpoint", error)
            false
        }
    }

    fun clear() = synchronized(lock) { file.delete() }

    companion object { private val lock = Any() }
}
