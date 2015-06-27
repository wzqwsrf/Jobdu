
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
	 * 1111
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			if (a.equals("-1")) {
				break;
			}
			char[] array = a.toCharArray();
			int length = array.length;
			int newArray[] = new int[length];
			int arrayA[] = new int[length];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i]-'0';
				arrayA[i] = array[i]-'0';
			}
			String result = "";
			int k = 2;
			while ( k<=9 ) {
				if (length == 1) {
					int tempa = Integer.parseInt(a);
					if (tempa%k==0) {
						result += k+" ";
					}
					k++;
				}else {
					for (int i = 0; i < length-1; i++) {
						int newa = newArray[i];
						newArray[i] = newArray[i]/k;
						newArray[i+1] += (newa%k)*10;
						int num = 0;
						if (i+1 == length-1 ) {
							num = newArray[i+1]%k;
							if (num == 0) {
								result += k+" ";
							}
						}
					}
					newArray = arrayA.clone();
					k++;
				}
			}
			if ("".equals(result)) {
				System.out.println("none");
			}else {
				System.out.println(result.trim());
			}
			
		}
	}
}
/**************************************************************
	Problem: 1125
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:800 ms
	Memory:45640 kb
****************************************************************/


                        