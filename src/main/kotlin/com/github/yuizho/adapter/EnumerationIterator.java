package com.github.yuizho.adapter;

import org.jetbrains.annotations.NotNull;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Iterableは拡張for文で回せるようにするために必要！！
 * https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Iterable.html
 */
class EnumerationIterator implements Iterator<Object>, Iterable<Object> {

    private final Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @NotNull
    @Override
    public Iterator<Object> iterator() {
        // 自分自身がIteratorなのでthis返せばOK!
        return this;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    // removeはdefaultでUnsupportedOperationExceptionになってる
}