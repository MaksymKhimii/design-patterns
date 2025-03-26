package com.khimii.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            return new ThreadSafeSingleton();
        }

        synchronized (ThreadSafeSingleton.class) {
            return instance;
        }
    }
}
