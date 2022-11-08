package com.bridgelabz;

public class smallestElementArray {
	public static void main(String[] args){
		int [] smallArr=new int [] {31, 9, 45, 56, 78, 59};
		int min=smallArr[0], i;
		for (i=0;i<smallArr.length;i++) {
		if(smallArr[i]<min)
			min=smallArr[i];
			
		}
		System.out.println("Smallest element in array is " + min);
	}

}
