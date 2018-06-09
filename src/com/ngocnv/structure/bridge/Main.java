package com.ngocnv.structure.bridge;

public class Main {
    public static void main(String[] args) {
        MessageLogger messageLogger = new ConsoleLogger();
        Message message1 = new EncryptedMessage(messageLogger);
        Message message2 = new TextMessage(messageLogger);
        MessageLogger messageLogger1 = new FileLogger();
        Message message3 = new EncryptedMessage(messageLogger1);
        message1.log("foo");
        message2.log("bar");
        message3.log("foobar");
    }
}
