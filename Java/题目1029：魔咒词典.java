
// 题目1029：魔咒词典

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1029
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
     * 1029
     */
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> magicMap = new HashMap<String, String>();
		String a = scanner.nextLine().trim();
		while (!a.equals("@END@")) {
			int index = a.indexOf(']');
			String magic = a.substring(0, index + 1);
			String function = a.substring(index + 2);
			magicMap.put(magic, function);
			magicMap.put(function, magic);
			a = scanner.nextLine().trim();
		}
		int m = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < m; i++) {
			String que = scanner.nextLine().trim();
			if (!magicMap.containsKey(que)) {
				System.out.println("what?");
			} else {
				System.out.println(magicMap.get(que).replace("[", "").replace(
						"]", ""));
			}
		}
	}}
/**************************************************************
 Problem: 1029
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:430 ms
 Memory:43860 kb
 ****************************************************************/




