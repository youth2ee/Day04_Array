package com.naver.array1;

import java.util.Scanner;

public class ArrayTest8 {

	public static void main(String[] args) { //"삭제" ★★★
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] numbers = {1,2,3,4,5};
		int[] numbers2 = new int[4];
		int index=0;
		int idx=0; //numbders2의 index

		System.out.println("1~5 사이의 값을 입력하시오");
		//입력값을 "삭제"하는법 (2를 입력하면 1,3,4,5만 남는다.)
		int count = sc.nextInt();

		for(index=0;index<numbers.length;index++) {
			if(count==numbers[index]) {
				break;
			}
		}//for1

		for(int i=0;i<numbers.length;i++) {
			if(index==i) {
				continue; //바로 증감식으로 간다.
			}
			numbers2[idx] = numbers[i];
			idx++;
		}//for2

		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);	
		}//for3


	}//메인

}
