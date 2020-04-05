package com.github.yuizho.adapter;

import java.util.Enumeration;
import java.util.StringTokenizer;

public class Main {
    public static void main(String... args) {
        Enumeration<Object> st = new StringTokenizer("this is a test");
        // Enumeration(Adaptee)をEnumerationIterator(Adapter)で変換して、
        // 拡張for文でループできるようにしている！！
        for (Object str : new EnumerationIterator(st)) {
            System.out.println(str);
        }
    }

}
