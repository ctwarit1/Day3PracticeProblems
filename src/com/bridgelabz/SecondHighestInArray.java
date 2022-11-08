package com.bridgelabz;

public class SecondHighestInArray {
public static void main(String[] args){
	int length;
	int[] array=new int [] { 12, 36, 72, 55, 69, 22, 71};
	length=array.length;
	int i;
	int highest=Integer.MIN_VALUE;
	int secondHighest=Integer.MIN_VALUE;
	for(i=0;i<length;i++) {
		if(array[i]>highest) {
			secondHighest=highest;
			highest=array[i];
		}
		if(array[i]<highest && array[i]>secondHighest) {
			secondHighest=array[i];
		
		}
		
	}
	System.out.println("Second largest number is " + secondHighest);
}
}
