package com.ngocnv.structure.factory.example1;

public class Factory {

    private Factory() {}
    public static <T extends IService> T getInstance(Class<T> serviceAClass) throws IllegalAccessException, InstantiationException {
        return serviceAClass.newInstance();
    }

}
