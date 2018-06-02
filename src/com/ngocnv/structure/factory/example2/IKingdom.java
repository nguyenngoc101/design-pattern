package com.ngocnv.structure.factory.example2;

public interface IKingdom {
    IKing king();
    ICastle castle();
    IArmy army();

    void getInfo();
}
