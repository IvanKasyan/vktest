package com.vktest;

public class ClientModel {

    private String name;
    private Integer id;
    private Double salary;

    public ClientModel(Integer cifra, Double dvicifri, String cifrivskobkah){
        id = cifra;
        salary = dvicifri;
        name = cifrivskobkah;
    }

    public void setId(int cifra) {
        id = cifra;
    }
    public Integer getId(){
        return id;
    }
    public void setName(String lol){
        name = lol;
    }
    public String getName(){
        return name;
    }
    public void setSalary(Double sos){
        salary = sos;
    }
    public Double getSalary(){
        return salary;
    }
}

