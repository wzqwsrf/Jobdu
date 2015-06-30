
// 题目1512：用两个栈实现队列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1512
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17243695
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
                if (a.equals("POP")) {
                    if (stack2.isEmpty()) {
                        while(!stack1.isEmpty()){
                            stack2.push(stack1.pop());
                        }
                    }
                    if (stack2.isEmpty()) {
                        System.out.println(-1);
                    }else {
                        System.out.println(stack2.pop());
                    }
                }else if (a.contains("PUSH")) {
                	st.nextToken();
                    int tempNum = (int) st.nval;
                    stack1.push(tempNum);
                }
            }
        }
    }}
/**************************************************************
 Problem: 1512
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1370 ms
 Memory:42204 kb
 ****************************************************************/




