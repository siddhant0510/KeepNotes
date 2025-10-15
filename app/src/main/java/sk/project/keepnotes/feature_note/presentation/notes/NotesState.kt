package sk.project.keepnotes.feature_note.presentation.notes

import sk.project.keepnotes.feature_note.domain.model.Note
import sk.project.keepnotes.feature_note.domain.util.NoteOrder
import sk.project.keepnotes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)