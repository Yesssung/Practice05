package com.javaex.ex05;

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        print.setA(10);
        print.setYesorno(true);
        print.setB(5.7);
        print.setName("홍길동");
//        
//        print.printer(10);
//        print.printer(true);
//        print.printer(5.7);
//        print.printer("홍길동");
        
        System.out.printf("%d%n%b%n%d%n%s", print.getA(), print.getB(),print.getB(), print.getName());
    }

}
