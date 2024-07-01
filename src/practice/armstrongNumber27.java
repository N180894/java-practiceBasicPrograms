package practice;

public class armstrongNumber27 {

	public static void main(String[] args) {
		int num1=153,c=0;
		int num2=num1;
		double result = 0;
		while(num2!=0) {
			num2=num2/10;
			c++;
		}

		num2=num1;
		while(num1!=0) {
			int rem=num1%10;
			result=result+Math.pow(rem, c);
			num1=num1/10;
			
		}
		if(num2==result) {
			System.out.println("The entered Number is  a Armstrong Number");
		}else {
			System.out.println("The entered Number is not a Armstrong Number");
		}
	}

}
