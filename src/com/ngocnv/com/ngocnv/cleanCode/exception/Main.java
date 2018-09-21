package com.ngocnv.com.ngocnv.cleanCode.exception;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        rethrowCheckedException();
        NoCatch.noCatch(Main::test1);
        NoCatch.noCatch(Main::test2);
    }

    // I've lost count number of times I've written this block of code
    public static void rethrowCheckedException() {
        try {
            // do stuff
            throw new AnnoyingCheckedException();

        } catch (AnnoyingCheckedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void swallowCheckedException() {
        try {
            // do stuff
            throw new AnnoyingCheckedException();

        } catch (AnnoyingCheckedException e) {
            // Do Nothing
        }
    }

    private static class AnnoyingCheckedException extends Exception {
    }

    private static void throwIOException()
    {
        throw helper(new IOException("I/O failure"));
    }

    private static <T extends Exception> RuntimeException helper(Exception e) throws T
    {
        throw (T) e;
    }

    private static <T extends Throwable> void throws_(Class<T> clazz) throws T
    {
    }

    public static void test() {
        try
        {
            throws_(IOException.class);
            throwIOException();
        }
        catch (IOException ioe)
        {
            System.out.println("caught I/O exception");
        }
    }
    public static Integer test1()  throws Exception { return 1;}
    public static void test2()  throws Exception { }

}
