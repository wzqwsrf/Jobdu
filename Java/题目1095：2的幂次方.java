
// 题目1095：2的幂次方

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1095
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 1095
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            printResult(n);
            System.out.println();
        }
    }

private static void printResult(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				stack.push(index);
			}
			index++;
			n /= 2;
		}
		boolean flag = true;
		while (!stack.isEmpty()) {
			int num = stack.pop();
			if (flag) {
				flag = false;
			}else {
				System.out.print("+");
			}
			if (num == 0) {
				System.out.print("2(0)");
			}else if (num == 1) {
				System.out.print("2");
			}else {
				System.out.print("2(");
				printResult(num);
				System.out.print(")");
			}
			index++;
		}
		
	}}
/**************************************************************
 Problem: 1095
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15512 kb
 ****************************************************************/




