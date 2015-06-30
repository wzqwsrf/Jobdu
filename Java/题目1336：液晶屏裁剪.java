
// 题目1336：液晶屏裁剪

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1336
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {

    /*
     * 1336
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            st.nextToken();
            int x = (int) st.nval;
            st.nextToken();
            int y = (int) st.nval;

            int t = gcd(x, y);
            x /= t;
            y /= t;
            if (a < x || b < y) {
                System.out.println(0 + " " + 0);
                continue;
            }
            int a1 = 0;
            int b1 = 0;
            t = Math.min(a / x, b / y);
            for (; t >= 0; t--) {
                a1 = t * x;
                b1 = t * y;
                if (a1 <= a && b1 <= b) {
                    break;
                }
            }

            System.out.println(a1 + " " + b1);
        }
    }

    private static int gcd(int x, int y) {
        int newx = Math.max(x, y);
        int newy = Math.min(x, y);
        int tempNum = 0;
        if (newx % newy == 0) {
            return newy;
        } else {
            while (newx % newy != 0) {
                tempNum = newx % newy;
                newx = newy;
                newy = tempNum;
            }
        }
        return newy;
    }
}
/**************************************************************
 Problem: 1336
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:350 ms
 Memory:14580 kb
 ****************************************************************/




