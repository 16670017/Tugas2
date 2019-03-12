package com.pijey.pasangankelas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { cariPasangan() }
    }

    fun cariPasangan() {
        val randomCewe = Random().nextInt(5) +1
        val randomCowo = Random().nextInt(10) +1

        val drawableResCewe = when (randomCewe) {
            1 -> R.drawable.cewe1
            2 -> R.drawable.cewe2
            3 -> R.drawable.cewe3
            4 -> R.drawable.cewe4
            else  -> R.drawable.cewe6
        }

        val drawableResCowo = when (randomCowo) {
            1 -> R.drawable.cowo1
            2 -> R.drawable.cowo2
            3 -> R.drawable.cowo3
            4 -> R.drawable.cowo7
            5 -> R.drawable.cowo8
            6 -> R.drawable.cowo9
            7 -> R.drawable.cowo11
            8 -> R.drawable.cowo13
            9 -> R.drawable.cowo14
            else -> R.drawable.cowo17
        }

        ivDadu1.setImageResource(drawableResCewe)
        ivDadu2.setImageResource(drawableResCowo)
    }
}
