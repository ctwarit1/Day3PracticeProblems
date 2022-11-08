package com.bridgelabz;

public class elementsOfEvenPosition {
public static void main(String[] args){
	int i;
	
	int [] evenPosition=new int [] {12, 88, 12, 36, 19, 82, 44, 67, 89, 97};
	for(i=0;i<evenPosition.length;i=i+2)
	System.out.println(evenPosition[i]);
}
}
