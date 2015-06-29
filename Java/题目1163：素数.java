
import java.util.ArrayList;
import java.util.List;
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
			String finalRe = "";
			List<String> reList = new ArrayList<String>();
			for (int i = 2; i < n; i++) {
				boolean flag = false;
				for (int j = 2; j < i; j++) {
					if (i%j == 0) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					String re = i+"";
					if (re.charAt(re.length()-1)-'0'==1) {
						reList.add(re);
					}
				}
			}
			if (reList != null &&!reList.isEmpty()) {
				for (int i = 0; i < reList.size(); i++) {
					finalRe += reList.get(i)+" ";
				}
				System.out.println(finalRe.trim());
			}else {
				System.out.println(-1);
			}
			
			
		}
	}
	
}
/**************************************************************
	Problem: 1163
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:140 ms
	Memory:19604 kb
****************************************************************/


                        