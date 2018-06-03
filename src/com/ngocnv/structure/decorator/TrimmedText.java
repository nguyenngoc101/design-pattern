package com.ngocnv.structure.decorator;

public class TrimmedText implements Text {

    private final Text origin;
    public TrimmedText(final Text text) {
        this.origin = text;
    }
    @Override
    public String read() {
        return this.origin.read().trim();
    }
}
