package com.example.smartcampusapp.sampledata

import com.example.smartcampusapp.model.CampusInfoItem

/**
 * Sample data for campus departments and information.
 * Contains a list of departments with their contact details and locations.
 */
object CampusInfoSample {
    /**
     * List of campus departments with contact information.
     */
    val departments = listOf(
        CampusInfoItem(
            id = 1,
            name = "Admissions Office",
            contact = "+1 (555) 123-4567",
            email = "admissions@campus.edu",
            location = "Building A, Room 101"
        ),
        CampusInfoItem(
            id = 2,
            name = "Student Affairs",
            contact = "+1 (555) 234-5678",
            email = "studentaffairs@campus.edu",
            location = "Building B, Room 205"
        ),
        CampusInfoItem(
            id = 3,
            name = "Library Services",
            contact = "+1 (555) 345-6789",
            email = "library@campus.edu",
            location = "Main Library, 2nd Floor"
        ),
        CampusInfoItem(
            id = 4,
            name = "IT Support",
            contact = "+1 (555) 456-7890",
            email = "itsupport@campus.edu",
            location = "Technology Center, Room 301"
        ),
        CampusInfoItem(
            id = 5,
            name = "Financial Aid Office",
            contact = "+1 (555) 567-8901",
            email = "finaid@campus.edu",
            location = "Administration Building, Room 150"
        ),
        CampusInfoItem(
            id = 6,
            name = "Health Services",
            contact = "+1 (555) 678-9012",
            email = "health@campus.edu",
            location = "Student Health Center, Ground Floor"
        )
    )
}
