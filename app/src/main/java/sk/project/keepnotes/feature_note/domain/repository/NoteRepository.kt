package sk.project.keepnotes.feature_note.domain.repository

import kotlinx.coroutines.flow.Flow
import sk.project.keepnotes.feature_note.domain.model.Note

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNotesById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}