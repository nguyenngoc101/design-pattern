package com.ngocnv.structure.factory.example1;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IService service = Factory.getInstance(ServiceA.class);
        service.execute();

    }
}
