
// 题目1117：整数奇偶排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1117
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17222485
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * 1061
     */
public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int num = 0;
			List<Integer> arrList1 = new ArrayList<Integer>();
			List<Integer> arrList2 = new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				num = (int) st.nval;
				if (num % 2 != 0) {
					arrList1.add(num);
				} else {
					arrList2.add(num);
				}
				if (i != 9) {
					st.nextToken();
				}
			}
			Collections.sort(arrList1);
			Collections.sort(arrList2);
			int len1 = arrList1.size();
			int len2 = arrList2.size();
			StringBuffer sb = new StringBuffer();
			for (int i = len1-1; i >= 0 ; i--) {
				sb.append(arrList1.get(i)+" ");
			}
			for (int i = 0; i < len2; i++) {
				sb.append(arrList2.get(i)+" ");
			}
			System.out.println(sb.toString().trim());
		}
	}}

/**************************************************************
 Problem: 1117
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1350 ms
 Memory:82300 kb
 ****************************************************************/




