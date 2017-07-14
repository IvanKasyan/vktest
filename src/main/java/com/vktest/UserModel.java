package com.vktest;

public class UserModel {

    private Integer id;
    private String name;

    public UserModel(int loh, String sykabla){
        id = loh;
        name = sykabla;
    }

    public UserModel(int loh2){
        id = loh2;
    }

    public void setName(String hz) {
        name = hz;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int bla){
        id = bla;
    }



}
