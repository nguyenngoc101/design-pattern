package com.ngocnv.Behavior.chainOfResponsibility;

public interface Chain {
    void setNext(Chain nextChain);

    void process(Number request);
}
