package com.vktest;


public class Singletone {

    private static Singletone instance = new Singletone();

    public static Singletone getInstance(){
        return instance;
    }

    private Singletone(){

    }


    public void redMan(){
        System.out.println("YOU");
    }

}
