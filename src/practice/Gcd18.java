package practice;

public class Gcd18 {

	public static void main(String[] args) {
		int num1=81,num2=153,gcd=1,i;
		
		for(i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);

	}

}
