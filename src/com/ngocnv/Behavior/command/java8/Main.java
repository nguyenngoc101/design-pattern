package com.ngocnv.Behavior.command.java8;

public class Main {
    public static void main(String[] args) {
        final CommandFactory cf = CommandFactory.init();

        cf.executeCommand("Light on");
        cf.listCommands();
    }
}
