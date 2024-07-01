package practice;

import java.util.Scanner;

public class multiplyFloatNumers {
public static void main(String[] args) {
	float num1=10;
	float num2=20;
	float product=num1*num2;
	System.out.println("The product is "+product);
	float number1;
	float number2;
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the first num :");
	number1=reader.nextFloat();
	System.out.println("Enter the Second num :");
	number2=reader.nextFloat();
	float Product1=number1*number2;
	System.out.println("The product is "+Product1);
}
}
