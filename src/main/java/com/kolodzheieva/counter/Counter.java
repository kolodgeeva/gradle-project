package com.kolodzheieva.counter;

public class Counter {

    public static int COUNT;

    public static void refresh() {
        COUNT = 0;
    }

    public static void increment() {
        COUNT++;
    }

    public static void newIncrement() {
        COUNT+=2;
    }

    public static void decrement() {
        COUNT--;
    }

}
