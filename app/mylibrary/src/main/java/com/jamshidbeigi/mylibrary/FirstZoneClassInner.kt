package com.jamshidbeigi.mylibrary

import android.content.Context
import android.content.Intent

class FirstZoneClassInner {


    companion object {
        fun sayHelloJamshidbeigi1(): String {

            return "Hello I'm first zone inner"
        }
        fun sayHelloSina1(context: Context, name: String) {
            //return "Hello $x"
            val i = Intent(context, FirstZoneActivity::class.java)
            i.putExtra("name", name)
            context.startActivity(i)
        }
    }

    fun sayHello(context: Context, name: String) {
        //return "Hello $x"
        val i = Intent(context, FirstZoneActivity::class.java)
        i.putExtra("name", name)
        context.startActivity(i)
    }

    fun sayHelloJamshidbeigi(): String {

        return "Hello I'm first zone inner"
    }
}