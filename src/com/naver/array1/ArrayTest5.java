package com.naver.array1;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//문자열 4개를 담을 수 있는 배열을 선언하고 반복문을 이용해서
		//4개의 데이터를 입력하세요

		String[] names = new String[4];
		int i=0;

		for(i=0;i<4;i++) {
			System.out.println(i+1+"번째");
			names[i] = sc.next();
		}

		for (i=0;i<4;i++) {
			System.out.println(names[i]);
		} //앞에서 입력받은 애를 전부 출력


	}//메인
}
