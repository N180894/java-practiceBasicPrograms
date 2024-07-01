package practice;

public class roots {

	public static void main(String[] args) {
		double a=2,b=10,c=5,root1,root2;
		double d=b*b-4*a*c;
		if(d>0) {
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The root 1 is:"+root1);
			System.out.println("The root 2 is:"+root2);
		}else if(d==0) {
			root1=-b/(2*a);
			System.out.printf("The root 1 and root 2 are same because the determinant value is 0,therefore the roots are:"+root1,root1);
		}else {
			System.out.println("The root are complex and different roots");
		}

	}

}
