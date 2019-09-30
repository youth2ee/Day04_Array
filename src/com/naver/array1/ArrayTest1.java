package com.naver.array1;

public class ArrayTest1 {

	public static void main(String[] args) {

		//배열선언
		//데이터타입 [] 변수명 = new 데이터타입 [개수];
		//ex) 정수형 데이터를 3개
		
		int [] numbers = new int [3];
		//읽는 법 : int [] (int 배열타입) - 레퍼런스 타입(primitive 타입X)
		//cf. int 와 int[]은 다르다.  
		//new의 의미는 heap에 만들어라
		//int[]
		//int, 변수명[0]
		
		numbers[0]=10;
		//numbers[0] : heap의 numbers가 시작하는 0번째 방 - int타입
		numbers[1]=20;
		numbers[2]=30;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		int n = numbers[0];
		numbers[2] = n;
		numbers[1]=(int)3.14;
		numbers[2]='c'; //자동형변환 
		
		System.out.println(numbers[5]); 
		//문법상은 틀리지 않지만 실행하다보니 생긴 에러
		//numbers에 5번째 방은 없으므로 생긴 에러 (배열의 범위를 벗어났다.)
		
	}

}
