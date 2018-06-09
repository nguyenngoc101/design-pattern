package com.ngocnv.structure.bridge;

public class TextMessage implements Message {

    private MessageLogger messageLogger;

    public TextMessage(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    @Override
    public void log(String msg) {
        String processedMsg = preProcess(msg);
        messageLogger.logMsg(processedMsg);
    }

    @Override
    public String preProcess(String msg) {
        return msg;
    }
}
