package com.naver.array1;

public class ArrayTest2 {
	public static void main(String[] args) {
	
		double [] numbers = new double [3];
		
		numbers[0] = 1.1;
		numbers[1] = 3.5;
		numbers[2] = 4.1;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		double [] numbers2 = numbers;
		//numbers2와 numbers는 같은 타입
		//변수선언 자체 double [] numbers2는 stack안에서 일어남
		//new만 heap에서 일어남
		
		numbers2[1]=12.2222222;
		//numbers2가 heap에가서 1번째 방의 수를 바꿔버림
		//따라서 아래에서 numbers가 1번 방에 가버리면 바뀐 값을 만난다.
		//stack에서 numbers, numbers2는 heap의 주소만을 가질 뿐
		
		System.out.println(numbers[1]);
		//numbers는 new하지 않았지만 numbers의 값을 받을 수 있다.
		
		
	}//메인

}
