package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsAscendingOrder {
	public static void main(String[] args){
		int n;
		Scanner value=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=value.nextInt();
		
		int[] array=new int[n];
		System.out.println("enter the elements for array: ");
		for(int i=0; i<n;i++){
			array[i]=value.nextInt();
			
		}
		System.out.println("array elements are: ");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		int i;
		System.out.println("elements in ascending order are: ");
		for( i=0;i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
			
		}
		
		
	}

}
