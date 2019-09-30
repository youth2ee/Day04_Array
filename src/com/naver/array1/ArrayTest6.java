package com.naver.array1;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("과목수를 입력하세요");
		int n = sc.nextInt();
		int [] subs = new int [n];

		String[] subjects = new String [n];
		
		int sum=0;
		//과목수만큼 과목명입력받기
		for(int i=0;i<subs.length;i++) {//subs.length : 배열의 길이를 알려주는 변수
			System.out.println(i+"과목명을 입력하세요");
			subjects[i]=sc.next();
		}
		
		for(int i=0;i<subs.length;i++) {
			System.out.println(i+1+"번째 : "+subjects[i]);
			subs[i]=sc.nextInt(); 
			//sum = sum + subs[i]; //누적함수
			sum+=subs[i];
		}



		System.out.println("합계 : "+sum+"점");
		System.out.println("평균 : "+sum/subs.length+"점");




	}//메인

}
