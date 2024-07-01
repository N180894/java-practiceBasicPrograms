package practice;

public class fibonacciSeries17 {

	public static void main(String[] args) {
		int n=10,i;
		int fact1=0,fact2=1;
		
		for(i=0;i<=n;i++) {
			int fact3=fact1+fact2;
			fact1=fact2;
			fact2=fact3;
			System.out.print(fact3+",");
		}

	}

}
