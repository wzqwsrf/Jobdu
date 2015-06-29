
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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			for (int i = 0; i <= 100; i++) {
				for (int j = 0; j <= 100; j++) {
					int sum = 14*i+8*j;
					if(sum <= (3*n-100)){
						System.out.println("x="+i+",y="+j+",z="+(100-i-j));
					}
					
				}
			}
		}
	}
}	

/**************************************************************
	Problem: 1045
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:160 ms
	Memory:19756 kb
****************************************************************/


                        