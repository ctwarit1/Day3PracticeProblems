package com.bridgelabz;

public class elementsDuplicateArray {
	public static void main(String[] args){
		int[] duplicateArr=new int[] {19, 2, 45, 19, 6, 75, 3, 2};
		System.out.println("duplicate elements in array is: ");;
		int i, j;
		for (i=0;i<duplicateArr.length;i++) {
			for(j=i+1;j<duplicateArr.length;j++) {
				if(duplicateArr[i]==duplicateArr[j])
				System.out.print(duplicateArr[j] + " ");

			}
			
		}
	}
	

}

