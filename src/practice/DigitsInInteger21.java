package practice;

public class DigitsInInteger21 {

	public static void main(String[] args) {
		int num1=123456789,c=0;
		while(num1!=0) {
			num1=num1/10;
			c++;
		}
		System.out.println(c);
	}

}
