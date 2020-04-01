package com.github.yuizho.command

interface Command {
    fun execute()
    fun undo()
}

class NoCommand : Command {
    override fun execute() {
    }

    override fun undo() {
    }
}

class StereoOnWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
    }

    override fun undo() {
        stereo.off()
    }
}

class StereoOffWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
        stereo.setCD()
    }
}