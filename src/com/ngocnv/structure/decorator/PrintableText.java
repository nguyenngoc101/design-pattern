package com.ngocnv.structure.decorator;

public class PrintableText implements Text {

    private final Text origin;
    public PrintableText(final Text text) {
        this.origin = text;
    }

    @Override
    public String read() {
        return this.origin.read()
                .replaceAll("[^\\p{Print}]", "");
    }
}
