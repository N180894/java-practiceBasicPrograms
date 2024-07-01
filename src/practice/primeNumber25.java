package practice;

public class primeNumber25 {

	public static void main(String[] args) {
		int num=20;
		int c=1;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("The entered String is a Prime Number");
		}else {
			System.out.println("The entered String is not a Prime Number");
		}
	}

}
