package com.example.ridesharingapp.repository

import com.example.ridesharingapp.models.Ride
import com.example.ridesharingapp.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RideRepository(private val apiService: ApiService) {

	fun getRideDetails(rideId: String, callback: (Ride?) -> Unit) {
		val call = apiService.getRideDetails(rideId)
		call.enqueue(object : Callback<Ride> {
			override fun onResponse(call: Call<Ride>, response: Response<Ride>) {
				if (response.isSuccessful) {
					callback(response.body())
				} else {
					callback(null)
				}
			}

			override fun onFailure(call: Call<Ride>, t: Throwable) {
				callback(null)
			}
		})
	}
}
