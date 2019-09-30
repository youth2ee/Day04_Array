package com.naver.array2;

import java.util.Scanner;

public class DoubleArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] nums = new int [2][3];
		//배열3칸짜리를 2개 모으겠다.

		System.out.println(nums[0][0]); //0
		//nums 0{0/1/2} 1{0/1/2}
		//heap영역의 데이터는 자동초기화 된다.
		//stack의 지역변수는 자동초기화 안된다.

		System.out.println(nums.length); //2
		//3개짜리 배열을 2개 모으므로 

		System.out.println(nums[0].length); //3
		//nums[0] 자체는 값 3개가진 배열이므로

		System.out.println(nums[0]); //nums의 주소

		Scanner sc = new Scanner(System.in);
		
		//int n =1; // 변수선언을 밖에서 해주면 값이 누적된다.
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = sc.nextInt();
				System.out.println("nums["+i+"]["+j+"] = "+nums[i][j]);
				
			}

		}

	}

}
