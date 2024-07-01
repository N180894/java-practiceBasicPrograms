package practice;

public class palindrome24 {
	public static void main(String[] args) {
		String s="mom",reverse="";
		for(int i=0;i<s.length();i++) {
			reverse=reverse+s.charAt(i);
		}
		System.out.printf("The Reverse is %s\n",reverse);
		if(s.toLowerCase()==reverse.toLowerCase()) {
			System.out.println("The entered String is a Palindrome");
		}else {
			System.out.println("The entered String is not a Palindrome");
		}
	}
}
