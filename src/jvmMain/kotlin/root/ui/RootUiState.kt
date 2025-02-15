package ui

import data.EntryModel
import data.TermbaseModel

data class RootUiState(
    val currentTermbase: TermbaseModel? = null,
    val currentEntry: EntryModel? = null,
    val openedTermbases: List<TermbaseModel> = emptyList(),
    val entryEditMode: Boolean = false,
    val definitionModelEditMode: Boolean = false,
)
