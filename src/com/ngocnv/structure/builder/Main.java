package com.ngocnv.structure.builder;

public class Main {

    public static void main(String[] args) {
        Message message = new Message.MessageBuilder()
                .setFrom("Ngoc")
                .setTo("Tho")
                .setContent("hello em")
                .build();
        System.out.println(message.from + " " + " " +message.to + " " +message.content);
    }
}
