package practice;

public class primeNumBtwTwoIntervalUsingFunction29 {

	public static void main(String[] args) {

		int start = 20, stop = 50;
		while (start < stop) {
			if (primeNumber(start)) {
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean primeNumber(int i) {
		boolean flag = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}
}
