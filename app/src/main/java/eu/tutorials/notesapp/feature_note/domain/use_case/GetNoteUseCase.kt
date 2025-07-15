package eu.tutorials.notesapp.feature_note.domain.use_case

import eu.tutorials.notesapp.feature_note.domain.model.Note
import eu.tutorials.notesapp.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}