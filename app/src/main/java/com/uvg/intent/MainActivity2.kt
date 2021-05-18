package com.uvg.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.Exception

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        var resultado = 0
        var valorA = 0
        var valorB = 0
        var operacion = ""

        if(bundle != null){
            operacion = bundle.getString("operacion").toString()


        }

        btnRegresar.setOnClickListener{
            val intent: Intent = Intent();

            try{
                valorA = Integer.parseInt(ValorA.text.toString())
            }catch (e: Exception){

            }

            try{
                valorB = Integer.parseInt(ValorB.text.toString())
            }catch (e: Exception){

            }

            when(operacion){
                "+" -> resultado = valorA + valorB
                "-" -> resultado = valorA - valorB
                "*" -> resultado = valorA * valorB
                "/" -> resultado = valorA / valorB

            }
            intent.putExtra("resultado", "$valorA $operacion $valorB = $resultado")
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}