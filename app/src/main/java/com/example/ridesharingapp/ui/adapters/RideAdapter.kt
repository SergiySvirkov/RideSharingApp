package com.example.ridesharingapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ridesharingapp.R
import com.example.ridesharingapp.models.Ride
import kotlinx.android.synthetic.main.item_ride.view.*

class RideAdapter(private val rides: List<Ride>) : RecyclerView.Adapter<RideAdapter.RideViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RideViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ride, parent, false)
		return RideViewHolder(view)
	}

	override fun onBindViewHolder(holder: RideViewHolder, position: Int) {
		val ride = rides[position]
		holder.bind(ride)
	}

	override fun getItemCount(): Int {
		return rides.size
	}

	class RideViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		fun bind(ride: Ride) {
			itemView.driverNameTextView.text = ride.driverName
			itemView.pickupLocationTextView.text = ride.pickupLocation
			itemView.dropoffLocationTextView.text = ride.dropoffLocation
			itemView.fareTextView.text = ride.fare.toString()
			itemView.statusTextView.text = ride.status
		}
	}
}
