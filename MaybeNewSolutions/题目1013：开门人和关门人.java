
import java.text.SimpleDateFormat;
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
	 * 1013
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dFormat  = new SimpleDateFormat("HH:mm:ss");
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			for (int i = 0; i < N; i++) {
				int M = scanner.nextInt();
				String id = scanner.next();
				String firstStr = scanner.next();
				String secStr = scanner.next();
				long firstTime = dFormat.parse(firstStr).getTime();
				long secTime = dFormat.parse(secStr).getTime();
				long firstNum = firstTime;
				long lastNum = secTime;
				String firstId = id;
				String lastId = id;
				for (int j = 1; j < M; j++) {
					String newId = scanner.next();
					String newFirstStr = scanner.next();
					String newSecStr = scanner.next();
					long newFirstTime = dFormat.parse(newFirstStr).getTime();
					long newSecTime = dFormat.parse(newSecStr).getTime();
					if (newFirstTime < firstNum ) {
						firstId = newId;
					}
					if (newSecTime > lastNum) {
						lastId = newId;
					}
				}
				System.out.println(firstId+" "+lastId);
			}
		}
	}
}
	
/**************************************************************
	Problem: 1013
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:120 ms
	Memory:17768 kb
****************************************************************/


                        