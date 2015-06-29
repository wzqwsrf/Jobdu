
import java.util.Scanner;

public class Main {
	/*
	 * 1471
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			
			String a = scanner.next();
			String b = scanner.next();
			int aLength = a.length();
			String result = "";
			for (int i = 0; i < aLength; i++) {
				result += String.valueOf(a.charAt(i));
				result += String.valueOf(b.charAt(aLength-i-1));
			}
			System.out.println(result);
		}
	}
}

/**************************************************************
	Problem: 1471
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:90 ms
	Memory:16740 kb
****************************************************************/


                        