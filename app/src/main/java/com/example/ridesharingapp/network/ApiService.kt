package com.example.ridesharingapp.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

	@GET("rides/{id}")
	fun getRideDetails(@Path("id") rideId: String): Call<Ride>
}
