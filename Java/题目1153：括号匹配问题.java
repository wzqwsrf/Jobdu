
// 题目1153：括号匹配问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1153
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17261663
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 1153
     */
public static void main(String[] args) throws  Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
        	Stack<Character> stack = new Stack<Character>();
            String a = scanner.nextLine();
            char array[] = a.toCharArray();
            int len = array.length;
            String result[] = new String[len];
//          将括号入栈，主要是左括号。如果发现左括号，就入栈。如果发现右括号，
//          并且栈不为空，那么肯定有坐括号对应，出栈。如果栈空，那么只有右
//          括号，即为不匹配，输出？号。
            int i = 0;
            while ( i < len) {
            	if (array[i] == '(') {
            		stack.push(array[i]);
					result[i] = " ";
				}else if (array[i] == ')') {
					if (!stack.isEmpty()) {
						stack.pop();
						result[i] = " ";
					}else {
						result[i] = "?";
					}
				}else {
					result[i] = " ";
				}
				i++;
			}
            i = len - 1;
            int j = 0;
            while (!stack.isEmpty()) {
				if (array[i] == ')') {
					j++;
				}else if (array[i] == '(') {
					if (j == 0){
                        result[i] = "$";
                        stack.pop();
                    }else{
                        j--;
                    }
				}
				i--;
			}
            StringBuffer sb = new StringBuffer();
            sb.append(a+"\n");
            for (int k = 0; k < len; k++) {
				sb.append(result[k]);
			}
            System.out.println(sb.toString());
        }
    }}
/**************************************************************
 Problem: 1153
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15464 kb
 ****************************************************************/




