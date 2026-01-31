package com.example.smartcampusapp.feature.campusinfo.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smartcampusapp.model.CampusInfoItem
import com.example.smartcampusapp.sampledata.CampusInfoSample
import com.example.smartcampusapp.ui.theme.SmartCampusAppTheme

/**
 * Campus Information Details screen displaying full department information.
 * 
 * @param department The department to display details for
 * @param onBack Callback invoked when back button is pressed
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampusInfoDetailsScreen(
    department: CampusInfoItem,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Department Details") },
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            // Department Name Card
            InfoCard(
                title = "Department",
                content = department.name,
                modifier = Modifier.fillMaxWidth()
            )
            
            // Contact Card
            InfoCard(
                title = "Contact",
                content = department.contact,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )
            
            // Email Card
            InfoCard(
                title = "Email",
                content = department.email,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )
            
            // Location Card
            InfoCard(
                title = "Location",
                content = department.location,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )
        }
    }
}

/**
 * Reusable card component for displaying information fields.
 * 
 * @param title The label/title for the information
 * @param content The content/value to display
 * @param modifier Modifier to be applied to the card
 */
@Composable
private fun InfoCard(
    title: String,
    content: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = content,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(top = 8.dp),
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CampusInfoDetailsScreenPreview() {
    SmartCampusAppTheme {
        CampusInfoDetailsScreen(
            department = CampusInfoSample.departments.first(),
            onBack = {}
        )
    }
}
