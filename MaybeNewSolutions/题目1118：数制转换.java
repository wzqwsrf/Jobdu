
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	/*
	 * 1118
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			String N = scanner.next();
			int b = scanner.nextInt();
			System.out.println(new BigInteger((N + ""), a).toString(b)
					.toUpperCase());
		}
	}

}
/**************************************************************
	Problem: 1118
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:350 ms
	Memory:27984 kb
****************************************************************/


                        