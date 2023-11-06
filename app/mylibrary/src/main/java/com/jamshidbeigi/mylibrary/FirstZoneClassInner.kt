package com.jamshidbeigi.mylibrary

import android.content.Context
import android.content.Intent

class FirstZoneClassInner {


    fun sayHello() : String{

        return "Hello I'm first zone inner"
    }

    fun sayHello(context: Context, name: String) {
        //return "Hello $x"
        val i = Intent(context, FirstZoneActivity::class.java)
        i.putExtra("name", name)
        context.startActivity(i)
    }
}