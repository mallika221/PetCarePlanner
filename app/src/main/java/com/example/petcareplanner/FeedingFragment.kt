package com.example.petcareplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import androidx.fragment.app.Fragment

class FeedingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_feeding, container, false)

        // Find the views from the layout
        val timePickerFeeding: TimePicker = view.findViewById(R.id.time_picker_feeding)
        val buttonSave: Button = view.findViewById(R.id.button_save)
        val textViewResult: TextView = view.findViewById(R.id.text_view_result)

        // Set the TimePicker to 24-hour view
        timePickerFeeding.setIs24HourView(true)

        // Set up the button click listener
        buttonSave.setOnClickListener {
            val hour = timePickerFeeding.hour
            val minute = timePickerFeeding.minute

            val selectedTime = String.format("%02d:%02d", hour, minute)
            textViewResult.text = "Feeding time saved: $selectedTime"
        }

        return view
    }
}
