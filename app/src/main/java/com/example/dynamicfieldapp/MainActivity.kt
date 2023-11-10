package com.example.dynamicfieldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import androidx.core.view.setPadding
import com.example.dynamicfieldapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fieldButton.setOnClickListener {
            addField()
        }
    }

    private fun addField() {
        val editText = EditText(this)

        editText.inputType = if (binding.numericCheckbox.isChecked)
            android.text.InputType.TYPE_CLASS_NUMBER
        else
            android.text.InputType.TYPE_CLASS_TEXT

        editText.hint = binding.nameInputEditText.text
        binding.editTextContainer.addView(editText)
    }
}