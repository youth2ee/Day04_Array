package com.naver.array1;

public class ArrayTest8_1 {

	public static void main(String[] args) {

		int [] n1 = {1,2,3}; //n1만 heap에 3칸 만든다.
		int [] n2 = n1; //n2는 heap에 만든 n1의 3칸의 주소를 공유할 뿐

		System.out.println("n1[0] :"+n1[0]); //1
		System.out.println("n2[0] :"+n2[0]); //2

		n1[0]=9; //얕은 복사

		System.out.println("n1[0] :"+n1[0]); //9
		System.out.println("n2[0] :"+n2[0]); //9

		//n1={9,2,3};

		n2 = new int [3]; //n2를 새로 heap에 3칸 만든다.  //깊은 복사

		for(int i=0;i<n2.length;i++) {
			n2[i]=n1[i];
		}	

		//n1={9,2,3};
		//n2={9,2,3};

		n1[0]=100;
		System.out.println("n1[0] :"+n1[0]); //100
		System.out.println("n2[0] :"+n2[0]); //9


	}//메인

}
