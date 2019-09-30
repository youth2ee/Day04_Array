package com.naver.array2;

public class DoubleArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 중에서 가변배열.
		
		int [][] nums = new int[2][];
		nums[0] = new int[2];
		nums[1] = new int[100];
		
		for(int i =0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				// nums[0]은 nums[i].length가 2
				// nums[1]은 nums[i].length가 100
			}
		}
		

	}

}
