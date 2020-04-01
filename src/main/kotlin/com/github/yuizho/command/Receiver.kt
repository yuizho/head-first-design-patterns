package com.github.yuizho.command

class Stereo(val name: String) {
    fun on() {
        println("Stereo at $name: turn on")
    }

    fun off() {
        println("Stereo at $name: turn off")
    }

    fun setCD() {
        println("Stereo at $name: the CD is set")
    }
}