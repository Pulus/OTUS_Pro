package ru.otus.pro.hw1.gradle;

import com.google.common.base.Joiner;

public class HelloOtus{
    public static void main(String[] args) {
        Joiner joiner = Joiner.on(", ").skipNulls();
        System.out.println(joiner.join("Hello", null, "Otus!"));
    }
}
