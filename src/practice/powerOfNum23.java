package practice;

public class powerOfNum23 {

	public static void main(String[] args) {
		int base=10;
		int exponent=5;
		double pow=1;
//		for(int i=1;i<=exponent;i++) {
//			pow=pow*base;
//		}
//		or
		pow=Math.pow(base, exponent);
		System.out.printf("Power of %d is %f",base,pow);
	}

}
