
// 题目1082：代理服务器

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1082
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    /*
     * 1082
     */
public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			Map<String, Integer> ipMap = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String ip = scanner.next();
				ipMap.put(ip, i);
			}
			int m = scanner.nextInt();
			Set<String> ipSet = new HashSet<String>();
			int times = 0;
			for (int i = 0; i < m; i++) {
				String ip = scanner.next();
				if (ipMap.containsKey(ip)) {
					ipSet.add(ip);
				}
				if (ipSet.size() == n) {
					times = (n == 1) ? -1 : (times+1);
					ipSet = new HashSet<String>();
				}
			}
			System.out.println(times);
		}
	}}
/**************************************************************
 Problem: 1082
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:300 ms
 Memory:29624 kb
 ****************************************************************/




