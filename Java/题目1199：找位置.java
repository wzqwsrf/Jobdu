
// 题目1199：找位置

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1199
 */

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
    //
    /*
     * 1199
     */
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String ab = scanner.nextLine();
			int length = ab.length();
			List<Character> chaList = new ArrayList<Character>();
			for (int i = 0; i < length; i++) {
				char a = ab.charAt(i);
				String bc = ab.substring(i + 1, length);
				if (bc.indexOf(a) != -1 && !chaList.contains(a)) {
					chaList.add(a);
				}
			}

			for (int i = 0; i < chaList.size(); i++) {
				String result = "";
				char c = chaList.get(i);
				for (int j = 0; j < length; j++) {
					if (ab.charAt(j) == c) {
						result += c + ":" + j + ",";
					}
				}
				System.out.println(result.substring(0, result.length() - 1));
			}
		}
	}
}

/**************************************************************
 Problem: 1199
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:710 ms
 Memory:38092 kb
 ****************************************************************/




