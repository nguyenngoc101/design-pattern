package com.ngocnv.structure.bridge;

public class EncryptedMessage implements Message {

    private MessageLogger messageLogger;

    public EncryptedMessage(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    @Override
    public void log(String msg) {
        String encryptedMsg = preProcess(msg);
        messageLogger.logMsg(encryptedMsg);
    }

    @Override
    public String preProcess(String msg) {
        return "Encrypted: " + msg;
    }
}
