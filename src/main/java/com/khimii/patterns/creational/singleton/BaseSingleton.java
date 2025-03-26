package com.khimii.patterns.creational.singleton;

public class BaseSingleton {
    private static BaseSingleton instance;

    private BaseSingleton() {
    }

    public static BaseSingleton getInstance() {
        if (instance == null) {
            return new BaseSingleton();
        }
        return instance;
    }
}
