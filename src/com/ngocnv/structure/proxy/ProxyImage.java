package com.ngocnv.structure.proxy;

public class ProxyImage implements Image {

    private Image image;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(fileName);
        }

        image.display();
    }
}
