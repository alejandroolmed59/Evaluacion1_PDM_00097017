package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser


class MainActivity : AppCompatActivity() {

    var contadorGlobal: Int = 0
    private lateinit var mProducto1: TextView
    private lateinit var mProducto2: TextView
    private lateinit var mProducto3: TextView
    private lateinit var mProducto4: TextView
    private lateinit var mProducto5: TextView
    private lateinit var mProducto6: TextView
    private lateinit var mProducto7: TextView
    private lateinit var mProducto8: TextView
    private lateinit var mProducto9: TextView
    private lateinit var mUser: EditText
    private lateinit var mEmail: EditText
    var arraydeContadores: MutableList<Int> = ArrayList()

    private lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        mProducto1 = findViewById(R.id.Producto1)
        mProducto2 = findViewById(R.id.Producto2)
        mProducto3 = findViewById(R.id.Producto3)
        mProducto4 = findViewById(R.id.Producto4)
        mProducto5 = findViewById(R.id.Producto5)
        mProducto6 = findViewById(R.id.Producto6)
        mProducto7 = findViewById(R.id.Producto7)
        mProducto8 = findViewById(R.id.Producto8)
        mProducto9 = findViewById(R.id.Producto9)
        mUser = findViewById(R.id.etUsuario)
        mEmail = findViewById(R.id.etEmail)

        mButton = findViewById(R.id.btn_submit)

        IniciarLista()
        mButton.setOnClickListener(View.OnClickListener {
            //val parser: Parser= Parser()
            //val stringBuilder: StringBuilder = StringBuilder("{\"name\""+mUser.text.toString()+":, \"email\":"+mEmail.text.toString()+"}")
            //val json: JsonObject = parser.parse(stringBuilder) as JsonObject
            // Log.v("json", ("Name : ${json.string("name")}, Age : ${json.int("email")}")
            for (i in 0..9) {
                contadorGlobal+= arraydeContadores.get(i)
            }
            intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("NAME", mUser.text.toString())
            intent.putExtra("EMAIL", mEmail.text.toString())
            intent.putParcelableArrayListExtra("ARRAY", arraydeContadores as java.util.ArrayList<out Parcelable>)
            intent.putExtra("CONTADOR", contadorGlobal.toString())
            Log.v("lol", contadorGlobal.toString())
            startActivity(intent)

        })
        mProducto1.setOnClickListener({
            arraydeContadores.set(1, arraydeContadores.get(1) + 1)
            mProducto1.setText(arraydeContadores.get(1).toString())


        })
        mProducto2.setOnClickListener({
            arraydeContadores.set(2, arraydeContadores.get(2) + 1)
            mProducto2.setText(arraydeContadores.get(2).toString())

        })
        mProducto3.setOnClickListener({
            arraydeContadores.set(3, arraydeContadores.get(3) + 1)
            mProducto3.setText(arraydeContadores.get(3).toString())

        })
        mProducto4.setOnClickListener({
            arraydeContadores.set(4, arraydeContadores.get(4) + 1)
            mProducto4.setText(arraydeContadores.get(4).toString())

        })
        mProducto5.setOnClickListener({
            arraydeContadores.set(5, arraydeContadores.get(5) + 1)
            mProducto5.setText(arraydeContadores.get(5).toString())

        })
        mProducto6.setOnClickListener({
            arraydeContadores.set(6, arraydeContadores.get(6) + 1)
            mProducto6.setText(arraydeContadores.get(6).toString())

        })
        mProducto7.setOnClickListener({
            arraydeContadores.set(7, arraydeContadores.get(7) + 1)
            mProducto7.setText(arraydeContadores.get(1).toString())
        })
        mProducto8.setOnClickListener({
            arraydeContadores.set(8, arraydeContadores.get(8) + 1)
            mProducto8.setText(arraydeContadores.get(8).toString())
        })
        mProducto9.setOnClickListener({
            arraydeContadores.set(9, arraydeContadores.get(9) + 1)
            mProducto9.setText(arraydeContadores.get(9).toString())
        })

    }


    fun IniciarLista() {
        for (i in 0..9) {
            arraydeContadores.add(i, 0)
        }
    }


}



