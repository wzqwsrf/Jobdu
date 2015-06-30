
// 题目1004：Median

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1004
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wangzhenqing
 * @data: 15/4/15 下午1:39
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size1 = scanner.nextInt();
            long arrays[] = new long[size1];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = scanner.nextLong();
            }
            int size2 = scanner.nextInt();
            long arrays2[] = new long[size2];
            for (int i = 0; i < arrays2.length; i++) {
                arrays2[i] = scanner.nextLong();
            }
            Arrays.sort(arrays);
            Arrays.sort(arrays2);
            System.out.println(findMedianSortedArrays(arrays, arrays2));
        }
    }

    public static long findMedianSortedArrays(long A[], long B[]) {
        int m = A.length;
        int n = B.length;
        int total = m + n;
        if (total % 2 != 0) {
            return findKth(A, 0, m - 1, B, 0, n - 1, total / 2 + 1);
        } else {
            return findKth(A, 0, m - 1, B, 0, n - 1, total / 2);
        }

    }

    private static long findKth(long[] A, int s1, int e1, long[] B, int s2,
            int e2, int k) {
        int m = e1 - s1 + 1;
        int n = e2 - s2 + 1;
        if (m > n) {
            return findKth(B, s2, e2, A, s1, e1, k);
        }
        if (s1 > e1) {
            return B[s2 + k - 1];
        }
        if (s2 > e2) {
            return A[s1 + k - 1];
        }
        if (k == 1) {
            return Math.min(A[s1], B[s2]);
        }
        int midA = Math.min(k / 2, m);
        int midB = k - midA;
        if (A[s1 + midA - 1] < B[s2 + midB - 1]) {
            return findKth(A, s1 + midA, e1, B, s2, e2, k - midA);
        } else if (A[s1 + midA - 1] > B[s2 + midB - 1]) {
            return findKth(A, s1, e1, B, s2 + midB, e2, k - midB);
        }
        return A[s1 + midA - 1];
    }
}

/**************************************************************
 Problem: 1004
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:18552 kb
 ****************************************************************/




