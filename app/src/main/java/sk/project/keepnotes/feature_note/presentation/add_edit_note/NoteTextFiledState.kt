package sk.project.keepnotes.feature_note.presentation.add_edit_note

data class NoteTextFiledState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
