package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str = "0"
        var d = true
        var c = true
        var x = false

        val scr = findViewById<TextView>(R.id.scr)
        val allclear = findViewById<Button>(R.id.allclear)
        val clear = findViewById<Button>(R.id.clear)
        val percent = findViewById<Button>(R.id.percent)
        val divide = findViewById<Button>(R.id.divide)
        val seven = findViewById<Button>(R.id.seven)
        val eight = findViewById<Button>(R.id.eight)
        val nine = findViewById<Button>(R.id.nine)
        val mul = findViewById<Button>(R.id.multiply)
        val four = findViewById<Button>(R.id.four)
        val five = findViewById<Button>(R.id.five)
        val six = findViewById<Button>(R.id.six)
        val sub = findViewById<Button>(R.id.sub)
        val one = findViewById<Button>(R.id.one)
        val two = findViewById<Button>(R.id.two)
        val three = findViewById<Button>(R.id.three)
        val plus = findViewById<Button>(R.id.plus)
        val zero = findViewById<Button>(R.id.zero)
        val dot = findViewById<Button>(R.id.dot)
        val equal = findViewById<Button>(R.id.equal)
        val cng = findViewById<Button>(R.id.change)

        scr.text = str

        one.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "1"
            }
            else {
                str += "1"
            }
            scr.text = str
            c = true
            x = false
        }
        two.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "2"
            }
            else {
                str += "2"
            }
            scr.text = str
            c = true
            x = false
        }
        three.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "3"
            }
            else {
                str += "3"
            }
            scr.text = str
            c = true
            x = false
        }
        four.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "4"
            }
            else {
                str += "4"
            }
            scr.text = str
            c = true
            x = false
        }
        five.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "5"
            }
            else {
                str += "5"
            }
            scr.text = str
            c = true
            x = false
        }
        six.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "6"
            }
            else {
                str += "6"
            }
            scr.text = str
            c = true
            x = false
        }
        seven.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "7"
            }
            else {
                str += "7"
            }
            scr.text = str
            c = true
            x = false
        }
        eight.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "8"
            }
            else {
                str += "8"
            }
            scr.text = str
            c = true
            x = false
        }
        nine.setOnClickListener {
            if((str.length == 1 && str == "0") || x){
                str = "9"
            }
            else {
                str += "9"
            }
            scr.text = str
            c = true
            x = false
        }
        zero.setOnClickListener {
            if(x){
                str = "0"
            }
            else {
                str += "0"
            }
            scr.text = str
            c = true
            x = false
        }
        allclear.setOnClickListener {
            str = "0"
            scr.text = str
            c = true
            x = false
        }
        fun clr() {
            str = str.dropLast(n = 1)
            if(str.isEmpty() || x){
                str = "0"
                x = false
            }
            scr.text = str
        }
        clear.setOnClickListener {
            clr()
        }
        plus.setOnClickListener {
            if(c){
                str += "+"
                c = false
            }
            scr.text = str
            d = true
            x = false
        }
        sub.setOnClickListener {
            if(c){
                str += "-"
                c = false
            }
            scr.text = str
            d = true
            x = false
        }
        mul.setOnClickListener {
            if(c){
                str += "*"
                c = false
            }
            scr.text = str
            d = true
            x = false
        }
        divide.setOnClickListener {
            if(c){
                str += "/"
                c = false
            }
            scr.text = str
            d = true
            x = false
        }
        percent.setOnClickListener {
            if(c){
                str += "%"
                c = false
            }
            scr.text = str
            d = true
            x = false
        }
        dot.setOnClickListener {
            if(d){
                str+="."
                scr.text = str
                d = false
                x = false
            }
        }
        equal.setOnClickListener {
            try {
                x = true
                val exp = ExpressionBuilder(str).build()
                val res = exp.evaluate()
                val res1 = res.toLong()
                if(res == res1.toDouble()){
                    str = res1.toString()
                }
                else {
                    str = res.toString()
                }
//                if(str.length>10){
//                    str = str.substring(0,10)
//                }
                scr.text = str
            }
            catch (e:Exception){
                str = "Error"
                scr.text = str
            }
        }
        cng.setOnClickListener {
            Intent(this,MainActivity2::class.java).also {
                startActivity(it)
            }
        }
    }

}