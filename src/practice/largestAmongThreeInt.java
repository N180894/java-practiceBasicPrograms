package practice;

public class largestAmongThreeInt {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=50;
		if(a>b&&a>c) {
			System.out.println(a+" is the largest among the given numbers ");
		}
		else if(b>a&&b>c) {
			System.out.println(b+" is the largest among the given numbers ");
		}else {
			System.out.println(c+" is the largest among the given numbers ");
		}
		
	}
}
