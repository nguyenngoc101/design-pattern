package com.ngocnv.structure.factory.example2;

public class FactoryManager {
    public enum KingdomType {
        ELF, ORC
    }

    public static IKingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElvenKingdomFactory();
            case ORC:
                return new OrcishKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }
}
