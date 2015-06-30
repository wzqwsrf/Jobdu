
// 题目1522：包含min函数的栈

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1522
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17242701
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

public class Main {
    /*
     * 1522
     */
public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            Stack<Integer> stack1 = new Stack<Integer>();
            Stack<Integer> stack2 = new Stack<Integer>();
            for (int i = 0; i < n; i++) {
            	st.nextToken();
                String a = st.sval;
                if (a.equals("o")) {
                    if (stack1.isEmpty()) {
                        System.out.println("NULL");
                    }else {
                        stack1.pop();
                        stack2.pop();
                        if (stack2.isEmpty()) {
                            System.out.println("NULL");
                        }else {
                            System.out.println(stack2.peek());
                        }
                    }
                }else if (a.contains("s")) {
                	st.nextToken();
                	int tempNum = (int) st.nval;
                    stack1.push(tempNum);
                    if (stack2.isEmpty()) {
                        stack2.push(tempNum);
                    }else {
                        if (tempNum < stack2.peek()) {
                            stack2.push(tempNum);
                        }else {
                            stack2.push(stack2.peek());
                        }
                    }
                    System.out.println(stack2.peek());
                }
            }
        }
    }}
/**************************************************************
 Problem: 1522
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:880 ms
 Memory:27384 kb
 ****************************************************************/




