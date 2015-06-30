
// 题目1261：寻找峰值点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1261
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1261
     */
    private static int array[];

    private static int n;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            if (n == 0) {
                break;
            }
            array = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            if (n == 1) {
                System.out.println(array[0]);
                continue;
            }
            int max = getMaxValue(0, n - 1);

            System.out.println(max);
        }
    }

    private static int getMaxValue(int left, int right) {
        while (left < right) {
            if (left + 1 == right) {
                return Math.max(array[left], array[right]);
            }
            int mid = (left + right) >> 1;
            int midmid = (mid + right) >> 1;
            if (mid + 1 == right) {
                midmid += 1;
            }
            if (midmid == right) {
                return Math
                        .max(Math.max(array[left], array[right]), array[mid]);
            }
            if (array[mid] >= array[midmid]) {
                right = midmid;
            } else {
                left = mid;
            }
        }
        return array[left];
    }
}

/**************************************************************
 Problem: 1261
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:980 ms
 Memory:38848 kb
 ****************************************************************/




