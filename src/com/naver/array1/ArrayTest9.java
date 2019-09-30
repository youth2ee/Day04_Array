package com.naver.array1;

import java.util.Scanner;

public class ArrayTest9 {

	public static void main(String[] args) {
		//1. 성적입력
		//2. 전체조회
		//3. 학생을 검색
		//4. 프로그램 종료
		//4번 누를때까지 한다.
		//과목은 국어영어수학
		// 인원은 N명
		//1번누르면 학생의 인원수묻고 
		//인원수만큼 이름, 국어, 영어, 수학 점수를 차례대로 묻는다.
		//2번누르면 전체학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//3번누르면 학생의 번호를 입력하면 그 학생의 정보가 뜬다.


		Scanner sc = new Scanner(System.in);

		boolean check = true;
		int count=0; //인원수
		String [] names =null;
		int [] kor=null;
		int [] eng=null;
		int [] math=null;
		int [] avg=null;
		int [] sum=null;
		int num=0;
		int [] numbers=null;

		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체조회");
			System.out.println("3. 학생검색");
			System.out.println("4. 종      료");
			num = sc.nextInt();
			System.out.println("=============");

			switch(num) {
			case 1: //성적입력

				System.out.println("인원수");
				count = sc.nextInt();

				numbers=new int[count];
				names= new String[count];
				kor = new int[count];
				eng = new int[count];
				math = new int[count];
				math = new int[count];
				sum = new int[count];
				avg = new int[count];
				
				for(int i=0;i<count;i++) {
					numbers[i] = i+1;
				
					System.out.println("이름");
					names[i] =sc.next();

					System.out.println("국어");
					kor[i]=sc.nextInt();

					System.out.println("영어");
					eng[i]=sc.nextInt();

					System.out.println("수학");
					math[i]=sc.nextInt();

					sum[i] = kor[i]+eng[i]+math[i];
					avg[i] = sum[i]/count;
					
					System.out.println("=============");
				}
				break;
			case 2:
				for(int i=0;i<names.length;i++) {
					System.out.println("이름 : "+names[i]);
					System.out.println("번호 : "+numbers[i]);
					System.out.println("국어 : "+kor[i]+"점");
					System.out.println("영어 : "+eng[i]+"점");
					System.out.println("수학 : "+math[i]+"점");
					System.out.println("합계 : "+sum[i]+"점");
					System.out.println("평균 : "+avg[i]+"점");
					System.out.println("=============");
				}
				break;
			case 3:
				System.out.println("번호입력");
				int j = sc.nextInt();

					System.out.println("이름 : "+names[(j-1)]);
					System.out.println("번호 : "+numbers[(j-1)]);
					System.out.println("국어 : "+kor[(j-1)]+"점");
					System.out.println("영어 : "+eng[(j-1)]+"점");
					System.out.println("수학 : "+math[(j-1)]+"점");
					System.out.println("합계 : "+sum[(j-1)]+"점");
					System.out.println("평균 : "+avg[(j-1)]+"점");
					System.out.println("==================");
				break;
			default:
				//check=false;
				check=!check;
			}

		}//while문




	}//메인 

}
