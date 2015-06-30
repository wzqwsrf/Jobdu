
// 题目1501：最大连续子序列乘积

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1501
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1501
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            double firstNum = st.nval;
            double res = firstNum;
            double min = firstNum;
            double max = firstNum;
            double temp1 = 0;
            double temp2 = 0;
            for (int i = 2; i < n + 1; i++) {
                st.nextToken();
                double num = st.nval;
                temp1 = min * num;
                temp2 = max * num;
                max = Math.max(Math.max(temp1, temp2), num);
                min = Math.min(Math.min(temp1, temp2), num);
                if (max > res) {
                    res = max;
                }
            }
            int secRes = (int) res;
            if (res < 0) {
                System.out.println(-1);
            } else if (res - secRes == 0) {
                System.out.println(secRes);
            } else {
                System.out.printf("%.2f\n", res);
            }
        }
    }
}

/**************************************************************
 Problem: 1501
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:830 ms
 Memory:24412 kb
 ****************************************************************/




