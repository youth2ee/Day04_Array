package com.naver.array1;

import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n1= {1,2,3};
		System.out.println(n1.length); //3

		int [] n2 = {1,2,3,4,5,6,7,8,9};
		System.out.println(n2.length); //9


		n1=n2; //오른쪽 거를 왼쪽에 넣는다. stack에 n1자리에 n2의 값(n2[]의 주소값)이 들어옴
		//n1의 주소값은 소멸되어 다시 찾을 수 없다.

		System.out.println(n1.length); //9

		//6~9사이의 숫자하나를 입력받아서
		//해당숫자의 인덱스 번호를 알려주세요

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int i=0;
		boolean check=false;
		
		for(;i<n2.length;i++) {
			if(number==n2[i]) {
				check=true;
				break;
			}
		}

		if(check==true) {
		System.out.println(i);
		}else {
			System.out.println("없는 번호입니다.");
		}


	}//메인

}
