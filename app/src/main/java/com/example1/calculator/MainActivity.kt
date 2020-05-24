package com.example1.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: View) {
        if(isNewOp)
        {
            etShowNumber.setText("")

}
        isNewOp=false


        val buSelect =view as  Button
        var buClickValue:String=etShowNumber.text.toString()

        when(buSelect.id)
        {
            bu0.id->{buClickValue+="0"}
            bu1.id->{buClickValue+="1"}
            bu2.id->{buClickValue+="2"}
            bu3.id->{buClickValue+="3"}
            bu4.id->{buClickValue+="4"}
            bu5.id->{buClickValue+="5"}
            bu6.id->{buClickValue+="6"}
            bu7.id->{buClickValue+="7"}
            bu8.id->{buClickValue+="8"}
            bu9.id->{buClickValue+="9"}
            buDot.id->{buClickValue+="."}
            buPlusMinues.id->{buClickValue="-"+buClickValue}

            }

        //etShowNumber.setText(buClickValue)
        etShowNumber.setText(etShowNumber.text +"")




        }
var op="*"
    var oldNumber=""
    var isNewOp=true


    fun opEvent(view: View) {

        var final:Double?=null

        val buSelect = view as Button

        when (buSelect.id) {
            buMulti.id -> {
                op = "*"
            }


            buDiv.id -> {
                op = "/"
            }
            buSub.id -> {
                op = "-"
            }
            buSum.id -> {
                op = "+"
            }


        }
        oldNumber=etShowNumber.text.toString()

        isNewOp=true






    }

    fun equelEvent(view: View) {


        var newNumber=etShowNumber.text.toString()
        var final:Double?=null

        when(op)
        {
            "*"->{
                final=newNumber.toDouble()*oldNumber.toDouble()
            }

            "/"->{
                final=newNumber.toDouble()/oldNumber.toDouble()
            }

            "+"->{
                final=newNumber.toDouble()+oldNumber.toDouble()
            }

            "-"->{
                final=oldNumber.toDouble()-newNumber.toDouble()
            }
        }
        etShowNumber.setText(final.toString())
            isNewOp=true

    }

    fun perEvent(view: View)
    {
        val number=etShowNumber.text.toString().toDouble()/100
        etShowNumber.setText(number.toString())



    }
    fun buClean(view: View)
    {
        etShowNumber.setText("0")
        isNewOp=true


    }


}



