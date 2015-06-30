
// 题目1500：出操队形

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1500
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1500
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            int dp[] = new int[n + 1];
            int newDP1[] = new int[n + 1];
            int newDP2[] = new int[n + 1];
            newDP1[1] = 1;
            newDP2[1] = 1;
            dp[1] = array[1];
            int len = 1;
            int j = 1;
            for (int i = 2; i < n + 1; i++) {
                if (dp[len] < array[i]) {
                    len++;
                    j = len;
                } else {
                    j = binSearch(array[i], dp, 1, len);
                }
                dp[j] = array[i];
                newDP1[i] = len;
            }

            dp[1] = array[n];
            len = 1;
            j = 1;
            for (int i = n - 1; i >= 1; i--) {
                if (dp[len] < array[i]) {
                    len++;
                    j = len;
                } else {
                    j = binSearch(array[i], dp, 1, len);
                }
                dp[j] = array[i];
                newDP2[n - i + 1] = len;
            }
            int res = 0;
            for (int i = 1; i < n + 1; i++) {
                int sum = newDP1[i] + newDP2[n - i + 1];
                if (sum > res) {
                    res = sum;
                }
            }
            System.out.println(res != 0 ? (n - res + 1) : 0);
        }
    }

    private static int binSearch(int key, int[] dp, int low, int high) {
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (key > dp[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
/**************************************************************
 Problem: 1500
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1840 ms
 Memory:54588 kb
 ****************************************************************/




