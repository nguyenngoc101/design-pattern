package com.ngocnv.structure.factory.example2;

public class ElvenKingdom implements IKingdom {

    @Override
    public IKing king() {
        return new ElvenKing();
    }

    @Override
    public ICastle castle() {
        return new ElvenCastle();
    }

    @Override
    public IArmy army() {
        return new ElvenArmy();
    }


    public void getInfo() {
        System.out.println(king().getClass().getSimpleName() + " "
                + castle().getClass().getSimpleName() + " "
                + army().getClass().getSimpleName());
    }


}
