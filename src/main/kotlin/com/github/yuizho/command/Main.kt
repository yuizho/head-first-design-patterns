package com.github.yuizho.command

fun main() {
    val remoteControl = RemoteControl()

    val stereo = Stereo("living Room")

    val stereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
    val stereoOffWithCDCommand = StereoOffWithCDCommand(stereo)

    // もしCommandのメソッドが一つならここはコマンドクラスを定義せずにlambdaでいける
    // remoteControl.setCommand(0, stereoOnWithCDCommand::on, stereoOffWithCDCommand::off)
    remoteControl.setCommand(0, stereoOnWithCDCommand, stereoOffWithCDCommand)

    println(remoteControl)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    remoteControl.undoButtonWasPushed()
}