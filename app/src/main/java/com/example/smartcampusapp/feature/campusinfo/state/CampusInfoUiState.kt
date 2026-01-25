package com.example.smartcampusapp.feature.campusinfo.state

import com.example.smartcampusapp.model.CampusInfoItem

/**
 * UI state for the Campus Information screen.
 * 
 * @param isLoading Indicates if data is currently being loaded
 * @param departments List of campus departments to display
 * @param selectedDepartment Currently selected department (if any)
 */
data class CampusInfoUiState(
    val isLoading: Boolean = false,
    val departments: List<CampusInfoItem> = emptyList(),
    val selectedDepartment: CampusInfoItem? = null
)
