
// 题目1534：数组中第K小的数字

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1534
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1534
     */
    private static long arrayA[];

    private static long arrayB[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            st.nextToken();
            long k = (long) st.nval;
            arrayA = new long[m];
            for (int i = 0; i < m; i++) {
                st.nextToken();
                arrayA[i] = (long) st.nval;
            }
            arrayB = new long[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                arrayB[i] = (long) st.nval;
            }
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            long left = arrayA[0] + arrayB[0];
            long right = arrayA[m - 1] + arrayB[n - 1];
            long result = left;
            while (left <= right) {
                long mid = (left + right) >> 1;
                long seq = compareK(m, n, mid);
                if (seq >= k) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(result);
        }
    }

    private static long compareK(int m, int n, long mid) {
        long res = 0;
        int j = n - 1;
        for (int i = 0; i < m; i++) {
            while (j >= 0 && (arrayA[i] + arrayB[j]) > mid) {
                j--;
            }
            //			System.out.println(i+"  "+j);
            //			因为j是从0开始的，所以要加1;这里其实是计算mid是第几个最小的数。
            res += j + 1;
        }
        //		System.out.println(res);
        return res;
    }
}

/**************************************************************
 Problem: 1534
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2100 ms
 Memory:33940 kb
 ****************************************************************/




