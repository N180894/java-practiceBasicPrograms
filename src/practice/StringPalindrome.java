package practice;

import java.util.Scanner;

public class StringPalindrome {

//	public static void main(String[] args) {
//		String str1="mom";
//		String str2="";
//		for(int i=str1.length()-1;i>=0;i--) {
//			str2=str2+str1.charAt(i);
//			
//		}
//		if(str1.equals(str2)) {
//			System.out.println("it is a palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//
//	}

	//using stringBuilder
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str1=scanner.nextLine();
		String str2=new StringBuilder(str1).reverse().toString();
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("it is a palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
	
}
