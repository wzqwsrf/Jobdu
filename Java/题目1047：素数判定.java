
// 题目1047：素数判定

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1047
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/36180571
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1047 2014年7月1日11:26:43
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int num = (int) st.nval;
            if (num <= 1) {
                System.out.println("no");
                continue;
            }
            boolean flag = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "no" : "yes");
        }
    }
}
/**************************************************************
 Problem: 1047
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:60 ms
 Memory:14552 kb
 ****************************************************************/




