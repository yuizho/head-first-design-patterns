package com.github.yuizho.command

class RemoteControl {
    private val onCommands: MutableList<Command> = mutableListOf(NoCommand(), NoCommand(), NoCommand())
    private val offCommands: MutableList<Command> = mutableListOf(NoCommand(), NoCommand(), NoCommand())
    private var undoCommand: Command = NoCommand()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands.add(slot, onCommand)
        offCommands.add(slot, offCommand)
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        return "------ Remote Control-------\n $onCommands \n $offCommands"
    }
}