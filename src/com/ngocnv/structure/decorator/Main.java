package com.ngocnv.structure.decorator;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Text printable = new PrintableText(
                new TextInFile(
                        new File(getPathname())));
        System.out.println(printable.read());


        final Text text = new AllCapsText(
                new TrimmedText(
                        new PrintableText(
                                new TextInFile(new File(getPathname()))
                        )
                )
        );
        System.out.println(text.read());
    }

    private static String getPathname() {
        return System.getProperty("user.dir") + "/src/com/ngocnv/structure/decorator/text.txt";
    }
}
