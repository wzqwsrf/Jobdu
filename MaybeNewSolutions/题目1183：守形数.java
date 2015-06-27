
import java.util.Scanner;

public class Main{
	/*
	 * 1183
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			int squareN = N*N;
			if (N < 10 && (squareN)%10 == N) {
				System.out.println("Yes!");
			}else if (N < 100 && (squareN)%100 == N) {
				System.out.println("Yes!");
			}else {
				System.out.println("No!");
			}
		}
	}
}

/**************************************************************
	Problem: 1183
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:110 ms
	Memory:18704 kb
****************************************************************/


                        