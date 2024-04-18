package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods cup = new Goods("머그컵",2000);
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		
		camera.showInfo();	// 디폴트 생성자로 밑에 set을 통해서 이름이랑 가격 넣어주기
		cup.showInfo();		// 기능 생성자가 있으니 객체생성시에 바로 이름이랑 가격 넣어주기
	}

}


