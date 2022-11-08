package com.bridgelabz;

public class elementsOfOddPosition {
	public static void main(String[] args){
		int i;
		int [] oddPosition=new int [] {12, 36, 19, 82, 44, 67, 89, 97};
		for(i=1;i<oddPosition.length;i=i+2)
		System.out.println(oddPosition[i]);
	
	}

}
