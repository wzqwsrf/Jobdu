
// 题目1131：合唱队形

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1131
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1131
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            int dpRise[] = new int[n];
            int dpDown[] = new int[n];
            for (int i = 0; i < n; i++) {
                int tempLen = 0;
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[i] && dpRise[j] >= tempLen) {
                        tempLen = dpRise[j];
                    }
                }
                dpRise[i] = tempLen + 1;
            }

            for (int i = n - 1; i >= 0; i--) {
                int tempLen = 0;
                for (int j = n - 1; j >= i; j--) {
                    if (array[j] < array[i] && dpDown[j] >= tempLen) {
                        tempLen = dpDown[j];
                    }
                }
                dpDown[i] = tempLen + 1;
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                int sum = dpDown[i] + dpRise[i];
                if (sum > res) {
                    res = sum;
                }
            }
            System.out.println(n - res + 1);
        }
    }
}
/**************************************************************
 Problem: 1131
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2580 ms
 Memory:33856 kb
 ****************************************************************/




