
// 题目1511：从尾到头打印链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1511
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17302673
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

public class Main {
    /*
     * 1181
     */
public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		Stack<Integer> stack = new Stack<Integer>();
		while (true) {
			
			st.nextToken();
		    int n = (int)st.nval;
		    if (n == -1) {
		    	break;
		    }
		    stack.push(n);
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()){
			sb.append(stack.pop()+"\n");
		}
    	System.out.println(sb.toString().trim());
	}}

/**************************************************************
 Problem: 1511
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1050 ms
 Memory:61608 kb
 ****************************************************************/




