package practice;

import java.util.Arrays;

public class StringPracticePrograms {
//	1.Check if Two Strings are Anagrams
//	Description: Two strings are anagrams if they contain the same characters in a different order.
//	Input: "listen", "silent"  
//	Output: true

//	public static void main(String[] args) {
//		String input = "listen";
//		String compare = "silent";
//		if ((input.length()) == (compare.length())) {
//			char[] arr1=input.toCharArray();
//			char[]arr2=compare.toCharArray();
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);
//			if(Arrays.equals(arr1, arr2)) {
//				System.out.println("Two strings are anagrams");
//			}
//			else {
//				System.out.println("Two strings are not anagrams");
//			}
//		} else {
//			System.out.println("Two strings are not anagrams");
//		}
//	}

//	2.Find the First Non-Repeating Character
//	Description: Return the first character that appears only once in a string.
//	Input: "swiss"  
//	Output: 'w'

//	public static void main(String[] args) {
//		firstNonRepeatingChar("swiss");
//	}
//	
//	public static void firstNonRepeatingChar(String input) {
//		
//		char[] arr=input.toCharArray();
//		for(int i=0;i<arr.length;i++) {
//			int c=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					c=c+1;
//				}
//			}
//			if(c==1) {	
//				System.out.println(arr[i]);
//				break;
//				 
//			}
//			
//		}
//	}

//	3.Check if String Contains Only Digits
//	Input: "12345" → true  
//	Input: "123a5" → false
//can also use !Character.isDigit(arr[i])
	
//	public static void main(String[] args) {
//		System.out.println(StringContainsOnlyDigit("123a5"));
//	}
//
//	public static boolean StringContainsOnlyDigit(String input) {
//		char[] arr=(input.toLowerCase()).toCharArray();
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<'0' || arr[i]>'9') {
//				return false;
//			}
//			
//			
//		}
//		return true;
//		
//	}
	
//	4.Count Vowels and Consonants in a String
//	Description: Ignore spaces and digits.
//	Input: "Hello Java!"  
//	Output: Vowels = 4, Consonants = 4
	
//	public static void main(String[] args) {
//		CountVowelsConsonants("hello world");
//	}
//		public static void CountVowelsConsonants(String input) {
//			String str=input.replaceAll("\\s+", "");
//			int v = 0,c=0;
//			char[] arr=str.toCharArray();
//			char[] vowels= {'a','e','i','o','u'};
//			for(int i=0;i< arr.length;i++) {
//				int f=0;
//				for(int j=0;j<vowels.length;j++) {
//					if(arr[i]==vowels[j]) {
//						f=f+1;
//						break;
//					}
//				}
//				if(f==1) {
//					v=v+1;
//				}else {
//					c=c+1;
//				}
//			}
//			System.out.printf("vowels count:%d\n",v);
//			System.out.printf("consonant count:%d\n",c);
//		}
		
//	5.Reverse Words in a Sentence
//	Description: Reverse each word, but not the sentence order.
//	Input: "Hello World"  
//	Output: "olleH dlroW"
	
	public static void main(String[] args) {
		reverseString("hello world");
	}
	
	public static void reverseString(String input) {
		String[] s=input.split(" ");
		
	}
	
	
	
}
