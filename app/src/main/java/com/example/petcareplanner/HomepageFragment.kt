package com.example.petcareplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class HomepageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_homepage, container, false)

        // Find the views from the layout
        val spinnerPetType: Spinner = view.findViewById(R.id.spinner_pet_type)
        val radioGroupGender: RadioGroup = view.findViewById(R.id.radio_group_gender)
        val buttonSubmit: Button = view.findViewById(R.id.button_submit)
        val textViewResult: TextView = view.findViewById(R.id.text_view_result)

        // Set up the spinner with pet types
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.pet_types,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerPetType.adapter = adapter
        }

        // Set up the button click listener
        buttonSubmit.setOnClickListener {
            val petType = spinnerPetType.selectedItem.toString()
            val selectedGenderId = radioGroupGender.checkedRadioButtonId
            val petGender = if (selectedGenderId == R.id.radio_button_male) {
                "Male"
            } else {
                "Female"
            }
            textViewResult.text = "Selected Pet: $petType, Gender: $petGender"
        }

        return view
    }
}
