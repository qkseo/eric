package com.example.demo;

public class GetSum {
    private int aa;
    private int bb;

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public void sum(){
        System.out.println("더하기");
        int result=aa+bb;
        System.out.println("합: "+result);
    }
}
