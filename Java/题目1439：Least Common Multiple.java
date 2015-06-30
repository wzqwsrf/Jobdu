
// 题目1439：Least Common Multiple

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1439
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1439
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int m = (int) st.nval;
                long result = 1;
                for (int j = 0; j < m; j++) {
                    st.nextToken();
                    long num = (long) st.nval;
                    result = (result * num) / gcd(result, num);
                }
                System.out.println(result);
            }
        }
    }

    static long gcd(long a, long b) {
        long newA = Math.max(a, b);
        long newB = Math.min(a, b);
        long tempNum = 0;
        if (newA % newB == 0) {
            return newB;
        } else {
            while (newA % newB != 0) {
                tempNum = newA % newB;
                newA = newB;
                newB = tempNum;
            }
        }
        return newB;
    }
}

/**************************************************************
 Problem: 1439
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14724 kb
 ****************************************************************/




