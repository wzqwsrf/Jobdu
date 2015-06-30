
// 题目1413：神秘元素

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1413
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1413
     */
    private static int array[];

    private static int n;

    private static int maxLen;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            array = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            int newDP1[] = getDPRise();
            int newDP2[] = getDPDown();

            int finalArr[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                int sum = newDP1[i] + newDP2[n - i + 1];
                if (sum == maxLen + 1) {
                    finalArr[newDP1[i]]++;
                }
            }
            int result = 0;
            for (int i = 1; i < n + 1; i++) {
                if (finalArr[i] == 1) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    private static int[] getDPRise() {
        maxLen = 0;
        int dp[] = new int[n + 1];
        int newDP1[] = new int[n + 1];
        newDP1[1] = 1;
        dp[1] = array[1];
        int len = 1;
        int j = 1;
        for (int i = 2; i < n + 1; i++) {
            if (dp[len] < array[i]) {
                len++;
                j = len;
            } else {
                j = binRiseSearch(array[i], dp, 1, len);
            }
            dp[j] = array[i];
            newDP1[i] = j;
            maxLen = Math.max(maxLen, len);
        }
        return newDP1;
    }

    private static int[] getDPDown() {
        int dp[] = new int[n + 1];
        int newDP2[] = new int[n + 1];
        newDP2[1] = 1;
        dp[1] = array[n];
        int len = 1;
        int j = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (dp[len] > array[i]) {
                len++;
                j = len;
            } else {
                j = binDownSearch(array[i], dp, 1, len);
            }
            dp[j] = array[i];
            newDP2[n - i + 1] = j;
        }
        return newDP2;
    }

    private static int binRiseSearch(int key, int[] dp, int low, int high) {
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

    private static int binDownSearch(int key, int[] dp, int low, int high) {
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (key < dp[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
/**************************************************************
 Problem: 1413
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1070 ms
 Memory:28696 kb
 ****************************************************************/




