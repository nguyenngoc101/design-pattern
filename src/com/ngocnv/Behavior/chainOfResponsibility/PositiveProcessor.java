package com.ngocnv.Behavior.chainOfResponsibility;

public class PositiveProcessor implements Chain {

    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            nextChain.process(request);
        }
    }
}
