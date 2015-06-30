
// 题目1136：Number Steps

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1136
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1136
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int x = (int) st.nval;
                st.nextToken();
                int y = (int) st.nval;
                if (x == y || (y + 2) == x) {
                    if (x % 2 == 0) {
                        System.out.println(x + y);
                    } else {
                        System.out.println(x + y - 1);
                    }
                } else {
                    System.out.println("No Number");
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1136
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:520 ms
 Memory:24312 kb
 ****************************************************************/




