
import java.util.Scanner;

public class Main {
	/*
     * 1009
     */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			String a = scanner.next();
			String ares = constructTree(a);
			while (n > 0) {
				String b = scanner.next();
				String bres = constructTree(b);
				System.out.println(ares.equals(bres) ? "YES" : "NO");
				n--;
			}
		}
    }

	private static String constructTree(String a) {
		String s1 = "";
		String s2 = "";
		int len = a.length();
		char array[] = a.toCharArray();
		int first = array[0] - '0';
		for (int i = 1; i < len; i++) {
			if (array[i] - '0' < first) {
				s1 += array[i];
			}else {
				s2 += array[i];
			}
		}
		return s1 +"_"+s2;
	}
}
/**************************************************************
	Problem: 1009
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15496 kb
****************************************************************/


                        