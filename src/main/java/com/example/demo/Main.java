package com.example.demo;

public class Main {

    public static void main(String[] args) {
        GetSum getsum = new GetSum();
        getsum.setAa(100);  // setAa 메소드를 사용해야 합니다.
        getsum.setBb(200);  // setBb 메소드를 사용해야 합니다.

        getsum.sum();
    }

}
