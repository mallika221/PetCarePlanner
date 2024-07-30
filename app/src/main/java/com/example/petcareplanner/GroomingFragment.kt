package com.example.petcareplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class GroomingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_grooming, container, false)

        val buttonSchedule: Button = view.findViewById(R.id.button_schedule)
        val editTextGroomingDate: EditText = view.findViewById(R.id.edit_text_grooming_date)
        val textViewGroomingResult: TextView = view.findViewById(R.id.text_view_grooming_result)

        buttonSchedule.setOnClickListener {
            val groomingDate = editTextGroomingDate.text.toString()
            textViewGroomingResult.text = "Grooming date scheduled: $groomingDate"
        }

        return view
    }
}
