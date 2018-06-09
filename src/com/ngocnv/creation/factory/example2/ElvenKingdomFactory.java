package com.ngocnv.creation.factory.example2;

public class ElvenKingdomFactory implements IKingdomFactory {

    @Override
    public IKingdom createKingdom() {
        return new ElvenKingdom();
    }
}
