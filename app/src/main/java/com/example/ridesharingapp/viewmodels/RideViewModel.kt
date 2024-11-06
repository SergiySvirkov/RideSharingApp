package com.example.ridesharingapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ridesharingapp.models.Ride
import com.example.ridesharingapp.repository.RideRepository

class RideViewModel(private val rideRepository: RideRepository) : ViewModel() {

	private val _rideDetails = MutableLiveData<Ride>()
	val rideDetails: LiveData<Ride> get() = _rideDetails

	fun fetchRideDetails(rideId: String) {
		rideRepository.getRideDetails(rideId) { ride ->
			_rideDetails.postValue(ride)
		}
	}
}
