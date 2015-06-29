
import java.util.Scanner;

public class Main {
	/*
	 * 1020
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			int MaxX = x;
			int MaxY = y;
			int MinX = x;
			int MinY = y;
			while (true) {
				if (x == 0 && y == 0) {
					break;
				}
				if (x > MaxX) {
					MaxX = x;
				}
				if (y > MaxY) {
					MaxY = y;
				}
				if (x < MinX) {
					MinX = x;
				}
				if (y < MinY) {
					MinY = y;
				}
				x = scanner.nextInt();
				y = scanner.nextInt();
			}
			System.out.println(MinX+" "+MinY+" "+MaxX+" "+MaxY);
			
		}
		
	}
}	

/**************************************************************
	Problem: 1020
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:130 ms
	Memory:19052 kb
****************************************************************/


                        