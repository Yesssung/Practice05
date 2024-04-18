package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i = 0; i < 3; i++ ) {
        	String name, hp, school;
        	System.out.println();
        	System.out.print("이름: ");
        	name = sc.nextLine();
   
        	System.out.print("핸드폰: ");
        	hp = sc.nextLine();

        	System.out.print("학교: ");
        	school = sc.nextLine();

        	System.out.println();
        	System.out.println("-------------------------------------");
        	
        	Friend friend = new Friend(); // class에 디폴트 생성자니깐 set 해줘야함!
        	friend.setName(name);
        	friend.setHp(hp);
        	friend.setSchool(school);
        	
        	
        	friendArray[i] = friend;

        }
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        	
        }

        sc.close();
    }

}































//package com.javaex.ex07;
//
//import java.util.Scanner;
//
//public class FriendApp {
//
//    public static void main(String[] args) {
//
//        Friend[] friendArr = new Friend[3];
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("친구를 3명 등록해 주세요");
//
//        
//        //for문 시작
//        //친구정보 3명 입력 로직 --> 반복문 사용
//        for(int i = 0; i < 3; i++) {
//        	// 데이터 입력
//        	String name, hp, school;
//        	
//        	System.out.print("이름: ");
//        	name = sc.nextLine();
//        	System.out.print("핸드폰: ");
//        	hp = sc.nextLine();
//        	System.out.print("학교: ");
//        	school = sc.nextLine();
//        	
//        	Friend newFriend = new Friend();
//        	newFriend.setName(name);
//        	newFriend.setHp(hp);
//        	newFriend.setSchool(school);
//        	
//        	// 배열에 참조주소 할당
//        	friendArr[i] = newFriend;
//        	System.out.println("----------------------------------");
//        }
//        
//        //for문 끝
//        
//        
//        // 친구정보 출력
//        for (int i = 0; i < friendArr.length; i++) {
//            //친구정보 출력 메소드 호출
//        	friendArr[i].showInfo();
//        }
//
//        sc.close();
//    }
//
//}
