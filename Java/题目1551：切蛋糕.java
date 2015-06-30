
// 题目1551：切蛋糕

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1551
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 2014年3月9日 22:55:47
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int R = (int) st.nval;
            st.nextToken();
            double r = st.nval;
            double low = 0.0;
            double high = 2 * R;
            double mid = 0;
            while ((high - low) >= 0.0001) {
                mid = (low + high) / 2;
                if (countArea(R, mid) > r) {
                    high = mid;
                } else {
                    low = mid;
                }
            }
            System.out.printf("%.2f\n", mid);
        }
    }

    public static double countArea(double R, double mid) {
        double du = Math.asin(mid / (2 * R));
        double l = R * R * du - 0.5 * mid * Math.sqrt(R * R - 0.25 * mid * mid);
        double r = R * R * Math.PI - l;
        return l / r;
    }
}

/**************************************************************
 Problem: 1551
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:380 ms
 Memory:15160 kb
 ****************************************************************/




