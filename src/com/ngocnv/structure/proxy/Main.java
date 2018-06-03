package com.ngocnv.structure.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("my_image.png");
        image.display();
    }
}
