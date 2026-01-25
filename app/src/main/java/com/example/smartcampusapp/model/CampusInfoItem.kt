package com.example.smartcampusapp.model

/**
 * Data model representing a campus department or information item.
 * 
 * @param id Unique identifier for the department
 * @param name Department name
 * @param contact Contact phone number
 * @param email Department email address
 * @param location Physical location of the department
 */
data class CampusInfoItem(
    val id: Int,
    val name: String,
    val contact: String,
    val email: String,
    val location: String
)
