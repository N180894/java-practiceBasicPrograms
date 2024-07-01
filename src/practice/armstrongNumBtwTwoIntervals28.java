//package practice;
//
//public class armstrongNumBtwTwoIntervals28 {
//
//	public static void main(String[] args) {
//		int  start = 0, stop = 400;
//		while(start<stop) {
//			System.out.println(armstrongNum(start));
//			start++;
//		}
//		public void armstrongNum(int start) {
//		for (int i = start; i <= stop; i++)    {
//			int num1 = i, c = 0;
//			int num2 = num1;
//			double result = 0;
//			while (num2 != 0) {
//				num2 = num2 / 10;
//				c++;
//			}
//			num2 = num1;
//			while (num1 != 0) {
//				int rem = num1 % 10;
//				result = result + Math.pow(rem, c);
//				num1 = num1 / 10;
//
//			}
//			if (num2 == result) {
//				System.out.printf("The Number %d is  a Armstrong Number\n",num2);
//			} else {
//				
//			}
//		}
//		
//	}
//
//}
