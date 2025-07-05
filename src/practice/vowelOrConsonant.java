package practice;

import java.util.Scanner;

public class vowelOrConsonant {
	public static void main(String[] args) {
		String alphabet[]= {"a","e","i","o","u"};
		String a;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a character:");
		a=reader.nextLine();
		for(int i=0;i<=alphabet.length;i++) {
			if(alphabet[i].equals(a)) {
				System.out.println("The entered character is a vowel");
				break;
				
			}else {
				System.out.println("The entered character is a consonant");
				break;
			}
			
		}
		reader.close();
		
	}
}
