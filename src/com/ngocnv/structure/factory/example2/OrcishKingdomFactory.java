package com.ngocnv.structure.factory.example2;

public class OrcishKingdomFactory implements IKingdomFactory {

    @Override
    public IKingdom createKingdom() {
       return new OrcishKingdom();
    }
}
