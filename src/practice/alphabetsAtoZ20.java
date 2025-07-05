package practice;

public class alphabetsAtoZ20 {

	public static void main(String[] args) {
		char ch='Z';
		int ascii =(int)ch;
		System.out.println(ascii);
		for(int i=(int)'A';i<=(int)'Z';i++) {
			System.out.printf((char)i+",");
		}
//		char c;
//		for(c='A';c<='Z';c++) {
//			System.out.printf(c+",");
//		}
	}

}
