package com.javaex.ex09;

public class StringUtilApp {

    public static void main(String[] args) {

        String[] strArray = {"SuperMan", "BatMan", "BatMan"};
        String resultStr = StringUtil.concatString(strArray);
        
        System.out.println("결과 문자열:" + resultStr);
    }

}
