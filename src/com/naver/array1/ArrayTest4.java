package com.naver.array1;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열, 반복문for문 같이 쓴다.
		// 1 : int타입의 상수
		// int num=1;

		System.out.println(1); //int형 상수
		int num=1;
		System.out.println(num); //int형 변수

		int[] numbers = new int [3];
		numbers[0]=10; //int[int형 상수]
		numbers[1]=20;
		numbers[2]=30;
		numbers[num]=40; //numbers[1]과 같다.
		//[]안에 int형 변수가 들어갈수 있다.

		for(int i=0;i<3;i++) {
			System.out.println(numbers[i]);
		}


	} //메인 

}
