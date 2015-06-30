
// 题目1356：孩子们的游戏(圆圈中最后剩下的数)

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1356
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1356
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            st.nextToken();
            int m = (int) st.nval;
            int finalChild = 0;
            for (int i = 2; i <= n; i++) {
                finalChild = (finalChild + m) % i;
            }
            System.out.println(finalChild + 1);
        }
    }
}
/**************************************************************
 Problem: 1356
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:690 ms
 Memory:16100 kb
 ****************************************************************/




