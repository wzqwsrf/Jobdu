
// 题目1041：Simple Sorting

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1041
 */

import java.io.StreamTokenizer;
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
public static void main(String[] args) throws Exception{
		StreamTokenizer st = new StreamTokenizer(System.in);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			Set<Integer> arrSet = new TreeSet<Integer>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arrSet.add((int) st.nval);
			}
			StringBuffer sb = new StringBuffer();
			for (Integer num : arrSet) {
				sb.append(num+" ");
			}
			System.out.println(sb.toString().trim());
		}
	}}

/**************************************************************
 Problem: 1041
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14664 kb
 ****************************************************************/




