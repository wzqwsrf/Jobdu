
// 题目1557：和谐答案

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1557
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1557
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[5];
            int posArr[] = new int[5];
            int dp[] = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            int low = 0;
            int high = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int colNum = (int) st.nval;
                for (int j = 0; j < colNum; j++) {
                    st.nextToken();
                    array[j] = (int) st.nval;
                    posArr[j] = searchPosition(dp, low, high, array[j]);
                }
                for (int j = 0; j < colNum; j++) {
                    dp[posArr[j]] = dp[posArr[j]] < array[j] ? dp[posArr[j]]
                            : array[j];
                    high = high > posArr[j] + 1 ? high : posArr[j] + 1;
                }
            }
            System.out.println(high);
        }
    }

    private static int searchPosition(int[] dp, int low, int high, int target) {
        int mid = 0;
        while (low <= high) {
            mid = (low + high) >> 1;
            if (dp[mid] == target) {
                return mid;
            }
            if (dp[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

/**************************************************************
 Problem: 1557
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:2320 ms
 Memory:26708 kb
 ****************************************************************/




