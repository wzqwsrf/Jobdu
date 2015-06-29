
import java.util.Scanner;

public class Main{
	/*
	 * 1438
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int newA = Math.max(a, b);
			int newB = Math.min(a, b);
			int tempNum = 0;
			if (newA % newB == 0) {
				tempNum = newB;
			}else {
				while (newA % newB != 0) {
					tempNum = newA % newB;
					newA = newB;
					newB = tempNum;
				}
			}
			System.out.println(a*b/newB);
			
		}
	}

}
/**************************************************************
	Problem: 1438
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:120 ms
	Memory:18964 kb
****************************************************************/


                        