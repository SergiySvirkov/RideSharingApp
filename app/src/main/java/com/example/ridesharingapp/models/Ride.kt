package com.example.ridesharingapp.models

data class Ride(
	val id: String,
	val driverName: String,
	val driverRating: Float,
	val pickupLocation: String,
	val dropoffLocation: String,
	val fare: Double,
	val status: String
)
