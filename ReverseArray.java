package com.sumitarora;

import java.util.Scanner;

/*
 * Program to shift array inputs by one place eg.
 * input array = 1, 2, 3, 4
 * output array = 2, 3, 4, 1
 */
public class RotateArray {
	
	public static void main(String[] args) {
		
		int t;
		int SIZE = 5;
		int[] inputArray = new int[SIZE];

		//-----------Take user input---------------//
		Scanner element = new Scanner(System.in);
		System.out.println("Enter Element : ");
		for (int i = 0; i < SIZE; i++) {
			inputArray[i] = element.nextInt();			
		}
		
		//-----------Shift places---------------//
		t = inputArray[0];
		for (int j = 0; j < SIZE; j++) {			
			if(j == SIZE -1){
				inputArray[j] = t;				
			}else{
				inputArray[j] = inputArray[j+1];
			}			
		}
		
		//-----------Display outputs---------------//
		for (int j = 0; j < SIZE; j++) {
			System.out.println(inputArray[j]);
		}		
	}
}
