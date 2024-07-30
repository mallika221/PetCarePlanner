package com.example.petcareplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.*

class VetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_vet, container, false)

        // Find the views from the layout
        val datePickerVet: DatePicker = view.findViewById(R.id.date_picker_vet)
        val buttonBook: Button = view.findViewById(R.id.button_book)
        val textViewVetResult: TextView = view.findViewById(R.id.text_view_vet_result)

        // Set up the button click listener
        buttonBook.setOnClickListener {
            val day = datePickerVet.dayOfMonth
            val month = datePickerVet.month + 1 // Month is 0-based
            val year = datePickerVet.year

            val selectedDate = "$day/$month/$year"
            textViewVetResult.text = "Vet visit date booked: $selectedDate"
        }

        return view
    }
}
