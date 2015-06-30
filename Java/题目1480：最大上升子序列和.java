
// 题目1480：最大上升子序列和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1480
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1480
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

            int sum[] = new int[n];
            for (int i = 0; i < n; i++) {
                int max = 0;
                for (int j = 0; j < i; j++) {
                    if (array[i] > array[j]) {
                        if (sum[j] > max) {
                            max = sum[j];
                        }
                    }
                }
                sum[i] = array[i] + max;
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                if (sum[i] > result) {
                    result = sum[i];
                }
            }
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1480
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:23432 kb
 ****************************************************************/




