package com.example.finalgrades

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.finalgrades.R.*
import com.example.finalgrades.R.id.btnBorrar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val nota1 = findViewById<EditText>(id.nota1)
        val nota2 = findViewById<EditText>(id.nota2)
        val nota3 = findViewById<EditText>(id.nota3)
        val btnCalcular = findViewById<Button>(id.btnCalcular)
        val btnBorrar = findViewById<Button>(btnBorrar)
        val txtResultado = findViewById<TextView>(id.txtResultado)

        btnCalcular.setOnClickListener {
            val n1 = nota1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = nota2.text.toString().toDoubleOrNull() ?: 0.0
            val n3 = nota3.text.toString().toDoubleOrNull() ?: 0.0

            val promedio = (n1 + n2 + n3) / 3

            val mensaje = if (promedio >= 3.0) {
                "Promedio: %.2f Aprobado ".format(promedio)
            } else {
                "Promedio: %.2f Reprobado".format(promedio)
            }
            txtResultado.text = mensaje
        }
        btnBorrar.setOnClickListener {
            nota1.text.clear()
            nota2.text.clear()
            nota3.text.clear()

        }

    }

}