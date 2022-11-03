package com.example.sqliteapp2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SharedPerferencesApp : AppCompatActivity() {
    lateinit var etNombre:EditText
    lateinit var etApellido:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_perferences_app)
        etNombre = findViewById(R.id.et_Nombre)
        etApellido = findViewById(R.id.et_Apellido)

        var pref = getSharedPreferences("_datosPersona", Context.MODE_PRIVATE)

        var nombre = pref.getString("nombre","")
        var apellido = pref.getString("apellido","")
        etNombre.setText(nombre)
        etApellido.setText(apellido)

    }

    fun guardar(vista: View){
        var pref = getSharedPreferences("_datosPersona", Context.MODE_PRIVATE)
        var editor = pref.edit()

        editor.putString("nombre",etNombre.text.toString())
        editor.putString("apellido",etApellido.text.toString())
        editor.commit()
        Toast.makeText(this, "Se ha guardado exitosamente", Toast.LENGTH_LONG).show()
    }
}