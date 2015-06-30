
// 题目1173：查找

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1173
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
    /*
     * 1173
     */
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			List<Integer> aimList = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				aimList.add(scanner.nextInt());
			}
			
			int m = scanner.nextInt();
			for (int i = 0; i < m; i++) {
				int num = scanner.nextInt();
				if (aimList.contains(num)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
		}
	}}

/**************************************************************
 Problem: 1173
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15496 kb
 ****************************************************************/




