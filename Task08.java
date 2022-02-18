package com.syntax.teamwork;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please Press Enter");
		String num=scan.nextLine();
		
		
int[]number ={10,15,45,10,32,75,50,100};
		
		int min=number[0];
		
		for (int n=1;n>number.length;n++) {
			if(number[n]>min) {
				min=number[n];
				min=scan.nextInt();
			}
		}System.out.println("Minimum Array number is " +min);
			
		System.out.println("Please Press Enter");
		String num1=scan.nextLine();
		
  int max=number[0];
		
		for (int n=1;n<number.length;n++) {
			if(number[n]>max) {
				max=number[n];
				max=scan.nextInt();
			}
		}System.out.println("Maximum Array number is " + max);
	}
}