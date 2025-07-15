package eu.tutorials.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import eu.tutorials.notesapp.ui.theme.BabyBlue
import eu.tutorials.notesapp.ui.theme.LightGreen
import eu.tutorials.notesapp.ui.theme.RedOrange
import eu.tutorials.notesapp.ui.theme.RedPink
import eu.tutorials.notesapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)