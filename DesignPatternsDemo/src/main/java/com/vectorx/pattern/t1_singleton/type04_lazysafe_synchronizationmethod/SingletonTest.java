package com.vectorx.pattern.t1_singleton.type04_lazysafe_synchronizationmethod;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); // true
        System.out.println(instance1.hashCode() + ", " + instance2.hashCode()); // 1735600054, 1735600054
    }
}
