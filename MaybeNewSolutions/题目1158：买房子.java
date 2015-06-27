
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
	 * 1158
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			int k = scanner.nextInt();
			double price = (float)k/(float)100;
			boolean flag = false;
			for (int i = 1; i <= 20; i++) {
				int yearlyPay = i*N;
				double newPrice = 200*Math.pow(1+price, i-1);
				if (yearlyPay >= newPrice) {
					System.out.println(i);
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Impossible");
			}
		}
	}
}

/**************************************************************
	Problem: 1158
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15504 kb
****************************************************************/


                        