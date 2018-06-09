package com.ngocnv.creation.builder;

public class Message {
    public String from;
    public String to;
    public String content;

    public Message(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    static class MessageBuilder {
        public String from;
        public String to;
        public String content;

        public MessageBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public MessageBuilder setTo(String to) {
            this.to = to;
            return this;
        }

        public MessageBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public Message build() {
            return new Message(this.from, this.to, this.content);
        }
    }
}
