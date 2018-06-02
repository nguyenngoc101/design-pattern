package com.ngocnv.structure.factory.example2;

public class Main {
    public static void main(String[] args) {
        IKingdom elvenKingdom = FactoryManager.makeFactory(FactoryManager.KingdomType.ELF).createKingdom();
        elvenKingdom.getInfo();
        IKingdom orcishKingdom = FactoryManager.makeFactory(FactoryManager.KingdomType.ORC).createKingdom();
        orcishKingdom.getInfo();
    }
}
