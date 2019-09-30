package com.naver.array2;

public class DoubleArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] nums = new int[2][3];
		//2차원 배열

		int [] n1 = {1,2,3}; //A
		int [] n2 = {4,5,6}; //B

		int [][] n3 = {{1,2,3},{4,5,6}}; //{A,B}
		// = int [][] n3 = {n1,n2};
		//int[][]는 int[]을 모은다.

		System.out.println(n3[0][1]); //2
		//n3의 0번 {1,2,3} - n3[0]의 0번 = 1
		//n3의 1번 {4,5,6} - n3[1]의 0번 = 4

		System.out.println(n3[1][2]); //6
		//n3의 1번의 2번

		System.out.println(n3[0]);


	}

}
