package practice;
//Java Program to Add Two Integers
import java.util.Scanner;

public class addTwoIntegers {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int total=num1+num2;
		System.out.println("The sum of "+num1+" and " + num2+" is "+total);
		int number1;
		int number2;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter First number:");
		number1=reader.nextInt();
		System.out.println("Enter Second number:");
		number2=reader.nextInt();
		int total1=number1+number2;
		System.out.println("The Sum of "+number1+" and "+number2+" is "+total1);
	}
}
