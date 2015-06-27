
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	/*
	 * 1504
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int m = scanner.nextInt();
			String array[] = new String[m];
			for (int i = 0; i < m; i++) {
				array[i] = scanner.next();
			}
			Arrays.sort(array , new MySort());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < m; i++) {
				sb.append(array[i]);
			}
			System.out.println(sb.toString());
		}
	}
	

}
class MySort implements Comparator<String>{

	public int compare(String o1, String o2) {
		String ab = o1+o2;
		String ba = o2+o1;
		int res = ab.compareTo(ba);
		return res;
	}
	
}

/**************************************************************
	Problem: 1504
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2140 ms
	Memory:146416 kb
****************************************************************/


                        