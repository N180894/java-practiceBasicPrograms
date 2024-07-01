package practice;

public class primeNumbersBetweenTwoIntervals {

	public static void main(String[] args) {
		int interval1=20,interval2=50,f=1,c=0;
		for(int i=interval1;i<=interval2;i++) {
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					f++;
				}
			}
			if(f==2) {
				c++;
				System.out.printf("Prime Numbers is %d\n",i);
			}
			
			f=1;
		}
		System.out.printf("Prime Numbers Between Two Intervals is %d\n",c);
	}

}
