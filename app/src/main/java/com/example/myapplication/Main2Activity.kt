package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    private lateinit var nombre: String
    private lateinit var email: String
    private lateinit var total: String
    private lateinit var mTVNombre: TextView
    private lateinit var mTVEmail: TextView
    private lateinit var mTVTotal: TextView
    private lateinit var mProducto1: TextView
    private lateinit var mProducto2: TextView
    private lateinit var mProducto3: TextView
    private lateinit var mProducto4: TextView
    private lateinit var mProducto5: TextView
    private lateinit var mProducto6: TextView
    private lateinit var mProducto7: TextView
    private lateinit var mProducto8: TextView
    private lateinit var mProducto9: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mTVNombre= findViewById(R.id.usuario_2nd)
        mTVEmail= findViewById(R.id.email_2nd)
        mTVTotal= findViewById(R.id.totalProductos_2nd)

        mProducto1 = findViewById(R.id.Producto1_2nd)
        mProducto2 = findViewById(R.id.Producto2_2nd)
        mProducto3 = findViewById(R.id.Producto3_2nd)
        mProducto4 = findViewById(R.id.Producto4_2nd)
        mProducto5 = findViewById(R.id.Producto5_2nd)
        mProducto6 = findViewById(R.id.Producto6_2nd)
        mProducto7 = findViewById(R.id.Producto7_2nd)
        mProducto8 = findViewById(R.id.Producto8_2nd)
        mProducto9 = findViewById(R.id.Producto9_2nd)

        intent= getIntent()
        nombre=intent.getStringExtra("NAME")
        email=intent.getStringExtra("EMAIL")
        total=intent.getStringExtra("CONTADOR")

        mTVNombre.text= nombre
        mTVEmail.text=email
        mTVTotal.text=total

        setearFacturaProductos()


    }

    private fun setearFacturaProductos() {
        mProducto1.text=intent.getStringExtra("1")
        mProducto2.text=intent.getStringExtra("2")
        mProducto3.text=intent.getStringExtra("3")
        mProducto4.text=intent.getStringExtra("4")
        mProducto5.text=intent.getStringExtra("5")
        mProducto6.text=intent.getStringExtra("6")
        mProducto7.text=intent.getStringExtra("7")
        mProducto8.text=intent.getStringExtra("8")
        mProducto9.text=intent.getStringExtra("9")
    }
}
