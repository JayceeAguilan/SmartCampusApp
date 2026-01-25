package com.example.smartcampusapp.feature.campusinfo.vm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.smartcampusapp.feature.campusinfo.state.CampusInfoUiState
import com.example.smartcampusapp.model.CampusInfoItem
import com.example.smartcampusapp.sampledata.CampusInfoSample

/**
 * ViewModel for managing Campus Information screen state and data.
 * Loads department data from sample data source.
 */
class CampusInfoViewModel : ViewModel() {
    
    private var _uiState by mutableStateOf(CampusInfoUiState())
    val uiState: CampusInfoUiState
        get() = _uiState
    
    init {
        loadDepartments()
    }
    
    /**
     * Loads departments from sample data.
     * Simulates loading state for better UX.
     */
    private fun loadDepartments() {
        _uiState = _uiState.copy(isLoading = true)
        
        // Simulate loading delay (can be removed if not needed)
        _uiState = _uiState.copy(
            isLoading = false,
            departments = CampusInfoSample.departments
        )
    }
    
    /**
     * Selects a department for detail view.
     * 
     * @param department The department to select
     */
    fun selectDepartment(department: CampusInfoItem) {
        _uiState = _uiState.copy(selectedDepartment = department)
    }
    
    /**
     * Clears the selected department.
     */
    fun clearSelection() {
        _uiState = _uiState.copy(selectedDepartment = null)
    }
}
