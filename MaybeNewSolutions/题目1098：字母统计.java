
import java.util.Scanner;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
	/*
	 * 1098
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String ab = scanner.next();
			int array[] = new int[26];
			for (int i = 0; i < array.length; i++) {
				array[i] = 0;
			}
			for (int i = 0; i < ab.length(); i++) {
				char a = ab.charAt(i);
				if (a>='A'&&a<='Z') {
					array[a-'A']++;
				}
			}
			
			for (int i = 0; i < array.length; i++) {
				System.out.println((char)('A'+i)+":"+array[i]);
			}
		}
		
	}
	
}
/**************************************************************
	Problem: 1098
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:110 ms
	Memory:17460 kb
****************************************************************/


                        