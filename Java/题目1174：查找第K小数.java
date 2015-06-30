
// 题目1174：查找第K小数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1174
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
     * 1174
     */
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			Set<Integer> set = new TreeSet<Integer>();
			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				set.add(num);
			}
			int k = scanner.nextInt();
			
			int size = set.size();
			int[] array = new int[size];
			int i = 0;
			for (int tempNum  : set) {
				array[i] = tempNum;
				i++;
			}
			if (k>size) {
				System.out.println(array[size-1]);
			}else if (k<=0) {
				System.out.println(array[0]);
			}else {
				System.out.println(array[k-1]);
			}
		}
	}}

/**************************************************************
 Problem: 1174
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:19928 kb
 ****************************************************************/




