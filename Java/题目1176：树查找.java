
// 题目1176：树查找

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1176
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

    /*
     * 1176
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            st.nextToken();
            int m = (int) st.nval;
            int deepmStart = (int) Math.pow(2, (m - 1));
            if (deepmStart > n) {
                System.out.println("EMPTY");
            } else {
                StringBuffer sb = new StringBuffer();
                for (int i = deepmStart; i <= (deepmStart * 2 - 1) && i <= n; i++) {
                    sb.append(array[i] + " ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}

/**************************************************************
 Problem: 1176
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14632 kb
 ****************************************************************/




