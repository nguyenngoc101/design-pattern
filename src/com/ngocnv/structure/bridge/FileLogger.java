package com.ngocnv.structure.bridge;

public class FileLogger implements MessageLogger {

    @Override
    public void logMsg(String msg) {
        System.out.println("Write message to the file:");
        System.out.println(msg);
    }
}
