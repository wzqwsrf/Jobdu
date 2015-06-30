
// 题目1085：求root(N, k)

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1085
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

    /*
     * 1085
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            long x = (long) st.nval;
            st.nextToken();
            long y = (long) st.nval;
            st.nextToken();
            int k = (int) st.nval;
            long result = expMod(x, y, k - 1);
            System.out.println(result == 0 ? k - 1 : result);

        }
    }

    private static long expMod(long x, long y, int k) {

        long result = 1;
        while (y != 0) {
            if ((y & 1) == 1)
                result = (result * x) % k;
            x = (x * x) % k;
            y = y >> 1;
        }
        return result;
    }
}
/**************************************************************
 Problem: 1085
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:190 ms
 Memory:24900 kb
 ****************************************************************/




