package com.bridgelabz;

public class largestElementArray {
	public static void main(String[] args){
		int [] largeArr=new int [] {12,31, 45, 56, 78, 59};
		int max=largeArr[0], i;
		for (i=0;i<largeArr.length;i++) {
			if(largeArr[i]>max)
			max=largeArr[i];
			
		}
		System.out.println("Largest element in array is " + max);
	}

}
