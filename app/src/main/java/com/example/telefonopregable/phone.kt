package com.example.telefonopregable

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    fun switchOff() {
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false):Phone(isScreenLightOn)
{
    var isFoldable: Boolean = false

    fun openFoldable (){
        isFoldable = true
    }

    fun closeFoldable (){
        isFoldable = false
    }

    override fun  switchOn(){

        if (!isScreenLightOn){
            isScreenLightOn = true
        }
    }
}

fun main(){

    val foldable= FoldablePhone()

    println(foldable.isFoldable)

    foldable.openFoldable()

    println(foldable.isFoldable)
}
