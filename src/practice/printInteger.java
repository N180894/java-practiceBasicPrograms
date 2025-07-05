package practice;

import java.util.Scanner;

//Java Program to Print an Integer (Entered by the User)
public class printInteger {
public static void main(String[] args) {
	int a=10;
	System.out.println("The integer to be printed is "+a);
	int b;
	System.out.println("Enter an Integer:");
	Scanner num=new Scanner(System.in);//takes input from the keyboard
	b=num.nextInt();//reads all entered integers from the keyboard unless it encounters a new line character \n (Enter)
	System.out.println("The user Entered Integer is:"+b);
	num.close();
}
}
