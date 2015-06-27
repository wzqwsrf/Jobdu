
import java.util.Arrays;
import java.util.Scanner;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main{
	/*
	 * 1066
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.nextLine();
			char [] arrayA = a.toCharArray();
			Arrays.sort(arrayA);
			String result = "";
			for (int i = 0; i < arrayA.length; i++) {
				result += arrayA[i];
				
			}
			System.out.println(result);
		}
	}
	
}
/**************************************************************
	Problem: 1066
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1840 ms
	Memory:174024 kb
****************************************************************/


                        