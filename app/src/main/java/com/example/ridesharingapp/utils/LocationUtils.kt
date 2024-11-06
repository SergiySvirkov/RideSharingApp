package com.example.ridesharingapp.utils

import android.content.Context
import android.location.Location
import android.location.LocationManager
import androidx.core.content.ContextCompat.getSystemService

object LocationUtils {

	fun isLocationEnabled(context: Context): Boolean {
		val locationManager = getSystemService(context, LocationManager::class.java)
		return locationManager?.isProviderEnabled(LocationManager.GPS_PROVIDER) == true ||
		locationManager?.isProviderEnabled(LocationManager.NETWORK_PROVIDER) == true
	}

	fun calculateDistance(startLat: Double, startLng: Double, endLat: Double, endLng: Double): Float {
		val results = FloatArray(1)
		Location.distanceBetween(startLat, startLng, endLat, endLng, results)
		return results[0]
	}
}
