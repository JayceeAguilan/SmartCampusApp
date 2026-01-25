package com.example.smartcampusapp.feature.campusinfo.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import com.example.smartcampusapp.core.ui.components.LoadingPlaceholder
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smartcampusapp.feature.campusinfo.state.CampusInfoUiState
import com.example.smartcampusapp.model.CampusInfoItem
import com.example.smartcampusapp.sampledata.CampusInfoSample
import com.example.smartcampusapp.ui.theme.SmartCampusAppTheme

/**
 * Campus Information screen displaying a list of departments.
 * 
 * @param uiState The current UI state containing departments and loading status
 * @param onBack Callback invoked when back button is pressed
 * @param onDepartmentClick Callback invoked when a department is clicked
 */
@Composable
fun CampusInfoScreen(
    uiState: CampusInfoUiState,
    onBack: () -> Unit,
    onDepartmentClick: (CampusInfoItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Campus Information") },
                navigationIcon = {
                    Text(
                        text = "← Back",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable(onClick = onBack),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        when {
            uiState.isLoading -> {
                LoadingPlaceholder(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                )
            }
            uiState.departments.isEmpty() -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No departments available",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
            else -> {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(12.dp)
                ) {
                    items(
                        items = uiState.departments,
                        key = { it.id }
                    ) { department ->
                        DepartmentCard(
                            department = department,
                            onClick = { onDepartmentClick(department) }
                        )
                    }
                }
            }
        }
    }
}

/**
 * Card component for displaying a department item.
 * 
 * @param department The department to display
 * @param onClick Callback invoked when the card is clicked
 */
@Composable
private fun DepartmentCard(
    department: CampusInfoItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = department.name,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = department.location,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 8.dp),
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CampusInfoScreenPreview() {
    SmartCampusAppTheme {
        CampusInfoScreen(
            uiState = CampusInfoUiState(
                isLoading = false,
                departments = CampusInfoSample.departments
            ),
            onBack = {},
            onDepartmentClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CampusInfoScreenLoadingPreview() {
    SmartCampusAppTheme {
        CampusInfoScreen(
            uiState = CampusInfoUiState(isLoading = true),
            onBack = {},
            onDepartmentClick = {}
        )
    }
}
