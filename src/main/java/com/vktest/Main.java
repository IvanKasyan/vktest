package com.vktest;

public class Main {
    public static void main(String[] args) {
        MegaTest test;
        test = MegaTest.getInstance();
        test.setFirstNumber(321);
        test.setSecondNumber(123);
        test.showSum();
    }
}
