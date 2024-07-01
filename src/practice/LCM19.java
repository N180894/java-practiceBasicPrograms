package practice;

public class LCM19 {

	public static void main(String[] args) {
		int num1=72,num2=120,lcm;
		if(num1>num2) {
			lcm=num1;
		}else {
			lcm=num2;
		}
		while(true) {
			if(lcm%num1==0 && lcm%num2==0 ) {
				System.out.printf("The LCM is %d:",lcm);
				break;
			}else {
				lcm++;
			}
			
		}
	}

}
