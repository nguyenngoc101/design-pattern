package com.ngocnv.Behavior.strategy;

import java.util.Collection;

public interface Sort {
    <T> void sort(Collection<T> collection);
}
