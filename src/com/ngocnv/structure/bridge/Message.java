package com.ngocnv.structure.bridge;

public interface Message {

    void log(String msg);

    String preProcess(String msg);
}
