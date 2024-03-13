package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.math.sqrt
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var str = ""
        var d = true
        var c = true
        var x = false
        var p = true

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
        val cng1 = findViewById<Button>(R.id.change1)
        val sqr = findViewById<Button>(R.id.sqr)
        val sqt = findViewById<Button>(R.id.sqrrt)
        val cube = findViewById<Button>(R.id.cube)
        val sin = findViewById<Button>(R.id.sin)
        val cos = findViewById<Button>(R.id.cos)
        val tan = findViewById<Button>(R.id.tan)
        val open = findViewById<Button>(R.id.open)
        val close = findViewById<Button>(R.id.close)
        val power = findViewById<Button>(R.id.power)
        val pi = findViewById<Button>(R.id.pi)

        scr.text = str

        one.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "1"
            }
            else {
                str += "1"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        two.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "2"
            }
            else {
                str += "2"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        three.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "3"
            }
            else {
                str += "3"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        four.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "4"
            }
            else {
                str += "4"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        five.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "5"
            }
            else {
                str += "5"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        six.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "6"
            }
            else {
                str += "6"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        seven.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "7"
            }
            else {
                str += "7"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        eight.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "8"
            }
            else {
                str += "8"
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        nine.setOnClickListener {
            if((str.length == 1 && str == "") || x){
                str = "9"
            }
            else {
                str += "9"
            }
            scr.text = str
            c = true
            x = false
            p = false
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
            p = false
        }
        allclear.setOnClickListener {
            str = ""
            scr.text = str
            c = true
            x = false
            p = true
        }
        fun clr() {
            str = str.dropLast(n = 1)
            if(str.isEmpty() || x){
                str = ""
                x = false
            }
            scr.text = str
        }
        clear.setOnClickListener {
            clr()
        }
        sin.setOnClickListener {
            if(p){
                if(str == ""){
                    str = "sin("
                }
                else {
                    str += "sin("
                }
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        cos.setOnClickListener {
            if(p){
                if(str == ""){
                    str = "cos("
                }
                else {
                    str += "cos("
                }
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        tan.setOnClickListener {
            if(p){
                if(str == ""){
                    str = "tan("
                }
                else {
                    str += "tan("
                }
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        plus.setOnClickListener {
            if(c){
                str += "+"
                c = false
            }
            scr.text = str
            d = true
            x = false
            p = true
        }
        sub.setOnClickListener {
            if(c){
                str += "-"
                c = false
            }
            scr.text = str
            d = true
            x = false
            p = true
        }
        mul.setOnClickListener {
            if(c){
                str += "*"
                c = false
            }
            scr.text = str
            d = true
            x = false
            p = true
        }
        divide.setOnClickListener {
            if(c){
                str += "/"
                c = false
            }
            scr.text = str
            d = true
            x = false
            p = true
        }
        percent.setOnClickListener {
            if(c){
                str += "%"
                c = false
            }
            scr.text = str
            d = true
            x = false
            p = true
        }
        open.setOnClickListener {
            str += "("
            scr.text = str
        }
        close.setOnClickListener {
            str += ")"
            scr.text = str
        }
        sqr.setOnClickListener {
            x = true
            val exp = ExpressionBuilder(str).build()
            val res = exp.evaluate()
            val z = res * res
            str = z.toString()
            if(str.length>10){
                str = str.substring(0,10)
            }
            scr.text = str
        }
        cube.setOnClickListener {
            x = true
            val exp = ExpressionBuilder(str).build()
            val res = exp.evaluate()
            val z = res * res * res
            str = z.toString()
            if(str.length>10){
                str = str.substring(0,10)
            }
            scr.text = str
        }
        sqt.setOnClickListener {
            x = true
            val exp = ExpressionBuilder(str).build()
            val res = exp.evaluate()
            val z = sqrt(res)
            str = z.toString()
//            if(str.length>10){
//                str = str.substring(0,10)
//            }
            scr.text = str
        }
        pi.setOnClickListener {
            if(p){
                if(str == ""){
                    str = "π"
                }
                else {
                    str += "π"
                }
            }
            scr.text = str
            c = true
            x = false
            p = false
        }
        power.setOnClickListener {
            if(c){
                str += "^"
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
                if( str.contains("π")){
                    str.replace("π","3.14159")
                }
                Toast.makeText(applicationContext,str,Toast.LENGTH_SHORT).show()
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
        cng1.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}