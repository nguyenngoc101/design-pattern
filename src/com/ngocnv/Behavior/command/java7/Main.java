package com.ngocnv.Behavior.command.java7;


public class Main {
    public static void main(String[] args) {

        String argument = args.length > 0 ? args[0].toUpperCase() : null;

        Light light = new Light();
        ICommand closeCommand = new CloseSwitchCommand(light);
        ICommand openCommand = new OpenSwitchCommand(light);

        Switch sw = new Switch(closeCommand, openCommand);

        if (argument.equals("ON")) {
            sw.Open();
        }
        else if (argument.equals("OFF")) {
            sw.Close();
        }
        else {
            throw new IllegalArgumentException("Argument 'ON' or 'OFF' is required!");
        }
    }
}
