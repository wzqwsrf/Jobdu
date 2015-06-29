
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
	 * 1168
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		while(scanner.hasNext()){
			String msg = scanner.nextLine();
			System.out.println(msg.replaceAll("(?i)"+a, "").replace(" ", ""));
		}
	}
}

/**************************************************************
	Problem: 1168
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15428 kb
****************************************************************/


                        