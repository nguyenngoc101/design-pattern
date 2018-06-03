package com.ngocnv.structure.decorator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextInFile implements Text {

    private final File file;

    public TextInFile(File file) {
        this.file = file;
    }

    @Override
    public String read() {
        try {
            return new String(Files.readAllBytes(Paths.get(file.getPath())), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Can not read the file");
        }
    }
}