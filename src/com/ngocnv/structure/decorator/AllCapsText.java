package com.ngocnv.structure.decorator;

import java.util.Locale;

public class AllCapsText implements Text {

    private final Text origin;
    public AllCapsText(final Text text) {
        this.origin = text;
    }
    @Override
    public String read() {
        return this.origin.read().toUpperCase(Locale.ENGLISH);
    }
}