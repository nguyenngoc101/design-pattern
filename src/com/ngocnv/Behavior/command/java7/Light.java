package com.ngocnv.Behavior.command.java7;

public class Light implements ISwitchable {

    @Override
    public void powerOn() {
        System.out.println("Light turned On!");
    }

    @Override
    public void powerOff() {
        System.out.println("Light turned Off!");
    }
}
