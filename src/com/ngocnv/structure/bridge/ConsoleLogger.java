package com.ngocnv.structure.bridge;

public class ConsoleLogger implements MessageLogger {

    @Override
    public void logMsg(String msg) {
        System.out.println("Print message to console:");
        System.out.println(msg);
    }
}
