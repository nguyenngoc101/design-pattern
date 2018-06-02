package com.ngocnv.structure.factory.example2;

public class OrcishKingdom implements IKingdom {

    @Override
    public IKing king() {
        return new OrcishKing();
    }

    @Override
    public ICastle castle() {
        return new OrcishCastle();
    }

    @Override
    public IArmy army() {
        return new OrcishArmy();
    }

    @Override
    public void getInfo() {
        System.out.println(king().getClass().getSimpleName() + " "
                + castle().getClass().getSimpleName() + " "
                + army().getClass().getSimpleName());
    }
}
