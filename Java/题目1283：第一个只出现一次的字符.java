
// 题目1283：第一个只出现一次的字符

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1283
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17350551
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1283
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String input = st.sval;
            int len = input.length();
            int array[] = new int[26];
            for (int i = 0; i < len; i++) {
                array[input.charAt(i) - 'A']++;
            }
            int first = -1;
            for (int i = 0; i < len; i++) {
                if (array[input.charAt(i) - 'A'] == 1) {
                    first = i;
                    break;
                }
            }
            System.out.println(first);
        }
    }
}
/**************************************************************
 Problem: 1283
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:260 ms
 Memory:24624 kb
 ****************************************************************/




