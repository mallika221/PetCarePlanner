package com.example.petcareplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class ExerciseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_exercise, container, false)

        val buttonAdd: Button = view.findViewById(R.id.button_add)
        val editTextExerciseType: EditText = view.findViewById(R.id.edit_text_exercise_type)
        val textViewExerciseResult: TextView = view.findViewById(R.id.text_view_exercise_result)

        buttonAdd.setOnClickListener {
            val exerciseType = editTextExerciseType.text.toString()
            textViewExerciseResult.text = "Exercise type added: $exerciseType"
        }

        return view
    }
}
