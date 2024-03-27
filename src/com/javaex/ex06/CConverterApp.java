package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1341.30); // 환율 세팅
        
        //100만원을 달러로 출력하기
        /*case1*/
        System.out.println("백만원은" + CConverter.toDollar(1000000) + " 달러 입니다.");
        /*case2*/
        dollar = CConverter.toDollar(1_000_000);
        System.out.println("백만원은" + dollar + " 달러 입니다. \n ");
        
        //100달러를 원으로 출력하기
        /*case1*/
        System.out.println("백달러는" + CConverter.toKWR(100) + "원 입니다.");
        
        /*case2*/
        won = CConverter.toKWR(100);
        System.out.println("백달러는" + won + "원 입니다. \n ");
        
    }

}
