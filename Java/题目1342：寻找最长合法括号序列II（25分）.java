
// 题目1342：寻找最长合法括号序列II（25分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1342
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 1342
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            char array[] = a.toCharArray();
            int num = 0;
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '(') {
                    stack.push(array[i]);
                } else if (array[i] == ')' && !stack.isEmpty()) {
                    stack.pop();
                    num += 2;
                }
            }
            System.out.println(num);
        }
    }
}

/**************************************************************
 * Problem: 1342
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:940 ms
 * Memory:40184 kb
 ****************************************************************/




