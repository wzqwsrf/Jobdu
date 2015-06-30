
// 题目1108：堆栈的使用

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1108
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 1108
     */
public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String n = scanner.nextLine().trim();
			int numN = Integer.parseInt(n);
			if (numN == 0 ) {
				break;
			}
			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < numN; i++) {
				String a = scanner.nextLine().trim();
				if (a.equals("A")) {
					if (stack.isEmpty()) {
						System.out.println("E");
					}else {
						System.out.println(stack.peek());
					}
					
				}
				
				if (a.equals("O")) {
					if (!stack.isEmpty()) {
						stack.pop();
					}
				}
				
				if (a.contains("P")) {
					int tempNum = Integer.parseInt(a.substring(2));
					stack.push(tempNum);
				}
			}
			System.out.println();
		}
	}
}
/**************************************************************
 Problem: 1108
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1050 ms
 Memory:104080 kb
 ****************************************************************/




