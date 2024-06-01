package com.example.aprendizajetek

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nombreEditText: EditText
    private lateinit var historiaCheckBox: CheckBox
    private lateinit var cienciasNaturalesCheckBox: CheckBox
    private lateinit var lenguaLiteraturaCheckBox: CheckBox
    private lateinit var matematicasCheckBox: CheckBox
    private lateinit var htmlCheckBox: CheckBox
    private lateinit var enviarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        nombreEditText = findViewById(R.id.nombreEditText)
        historiaCheckBox = findViewById(R.id.historiaCheckBox)
        cienciasNaturalesCheckBox = findViewById(R.id.cienciasNaturalesCheckBox)
        lenguaLiteraturaCheckBox = findViewById(R.id.lenguaLiteraturaCheckBox)
        matematicasCheckBox = findViewById(R.id.matematicasCheckBox)
        htmlCheckBox = findViewById(R.id.htmlCheckBox)
        enviarButton = findViewById(R.id.enviarButton)

        // Set click listener for the button
        enviarButton.setOnClickListener {
            // Get values from the form
            val nombre = nombreEditText.text.toString()
            val materias = mutableListOf<String>()
            if (historiaCheckBox.isChecked) materias.add("historia")
            if (cienciasNaturalesCheckBox.isChecked) materias.add("ciencias-naturales")
            if (lenguaLiteraturaCheckBox.isChecked) materias.add("lengua-literatura")
            if (matematicasCheckBox.isChecked) materias.add("matematicas")
            if (htmlCheckBox.isChecked) materias.add("html")

            // Display a toast with the selected data
            val message = "Nombre: $nombre\nMaterias: ${materias.joinToString(", ")}"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            // Replace this with actual form processing logic
            // (e.g., send data to a server, navigate to another activity)
        }
    }
}