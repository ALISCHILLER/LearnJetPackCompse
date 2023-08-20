package com.msa.statelearn.statecustofun

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


//var name :String =""
//    set(value) {
//        field ="Hi ${value.trim()}"
//    }
var name by TrimaAppend()
var name2 by TrimaAppend()
fun main() {
    name =" Hamid"
    name2 =" Hamid2"

    println(name)
    println(name2)
}



class TrimaAppend:ReadWriteProperty<Any?,String>{
    private var trimvALUE =""
    override fun getValue(thisRef: Any?, property: KProperty<*>)=trimvALUE

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        trimvALUE="Hi ${value.trim()}"
    }

}