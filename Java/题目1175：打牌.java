
// 题目1175：打牌

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1175
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
     * 1175
     */
public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int numCount[] = new int[10];
			String a = scanner.next();
			String b = scanner.next();
			int alen = a.length();
			int blen = b.length();
			List<Integer> arrList = new ArrayList<Integer>();
			for (int i = 0; i < alen; i++) {
				int num = a.charAt(i)- '0';
				numCount[num]++;
				arrList.add(num);
			}
			boolean flag = false;
			if (blen < 5) {
				int firNum = b.charAt(0)-'0';
				for (int i = firNum + 1; i < 10; i++) {
					if (numCount[i] >= blen) {
						System.out.println("YES");
						flag = true;
						break;
					}
				}
			}
			if (blen == 5) {
				int count = 0;
				int firNum = b.charAt(0)-'0';
				for (int i = firNum + 1; i < 10; i++) {
					if (numCount[i] > 0) {
						count++;
					}else {
						count = 0;
					}
					if (count == 5) {
						System.out.println("YES");
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				System.out.println("NO");
			}
		}
    }}

/**************************************************************
 Problem: 1175
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1030 ms
 Memory:43648 kb
 ****************************************************************/




