package com.vktest;

public class MegaTest {

    private Integer firstNumber;
    private int secondNumber;

    private static MegaTest instance = new MegaTest();

    public static MegaTest getInstance(){
        return instance;
    }

    public void setFirstNumber(Integer zero){
        firstNumber = zero;
    }
    public void setSecondNumber(int stats){
        secondNumber = stats;
    }


    private MegaTest() {
    }

    public void showSum(){
        if (firstNumber==null) throw new NullPointerException();
        System.out.println(firstNumber+secondNumber);
    }


}
