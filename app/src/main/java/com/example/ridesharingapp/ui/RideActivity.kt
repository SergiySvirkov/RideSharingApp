package com.example.ridesharingapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.ridesharingapp.R
import com.example.ridesharingapp.viewmodel.RideViewModel

class RideActivity : AppCompatActivity() {

	private lateinit var rideViewModel: RideViewModel

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_ride)

		// Initialize ViewModel
		rideViewModel = ViewModelProvider(this).get(RideViewModel::class.java)

		// Observe data and update UI
		rideViewModel.rideDetails.observe(this, { ride ->
			// Update UI with ride details
			// For example, set text views with ride information
		})

		// Fetch ride details (assuming rideId is passed via intent)
		val rideId = intent.getStringExtra("RIDE_ID")
		if (rideId != null) {
			rideViewModel.fetchRideDetails(rideId)
		}
	}
}
