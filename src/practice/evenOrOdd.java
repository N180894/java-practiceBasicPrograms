package practice;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a num:");
		num=reader.nextInt();
		if(num%2==0) {
			System.out.println("The Entered number is an even number");
		}
		else {
			System.out.println("The Entered number is an odd number");
		}
		reader.close();
	}

}
