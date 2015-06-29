
import java.util.Scanner;

public class Main {
	/*
	 * 1093
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dic = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while (scanner.hasNextLine()) {
			String a = scanner.nextLine();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				int index = dic.indexOf(c) ;
				if (index != -1) {
					sb.append(dic.charAt(index-1));
				}else {
					sb.append(c);
				}
			}
			System.out.println(sb);
		}
	}
	
}
/**************************************************************
	Problem: 1093
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15408 kb
****************************************************************/


                        