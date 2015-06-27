
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
	 * 1021
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.nextLine();
			if (a.equals("#")){
				 break;
			}
			char [] arrayA = a.toCharArray();
			String b = scanner.nextLine();
			char [] arrayB = b.toCharArray();
			int array[] = new int[a.length()];
			for (int i = 0; i < a.length(); i++) {
				char c = arrayA[i];
				for (int j = 0; j < b.length(); j++) {
					if (arrayB[j]==c) {
						array[i]++;
					}
				}
			}
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(arrayA[i]+" "+array[i]);
			}
		}
	}
	
}

/**************************************************************
	Problem: 1021
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15424 kb
****************************************************************/


                        