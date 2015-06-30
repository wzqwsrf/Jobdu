
// 题目1385：重建二叉树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1385
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1385
     */
    private static int[] preOrderArr;

    private static int[] inOrderArr;

    private static int[] middle;

    private static int[] post;

    private static int K, M;

    private static boolean flag;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            middle = new int[n];
            for (int i = 0; i < n; i++) {
                middle[i] = -1;
            }
            post = new int[n];
            preOrderArr = new int[n];
            inOrderArr = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                preOrderArr[i] = (int) st.nval;
            }
            for (int i = 0; i < n; i++) {
                st.nextToken();
                inOrderArr[i] = (int) st.nval;
            }
            flag = true;
            K = 0;
            M = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (preOrderArr[i] == inOrderArr[j]) {
                        middle[i] = j;
                    }
                }
            }
            createTree(0, n - 1);
            if (flag) {
                for (int i = 0; i < n; ++i) {
                    System.out.printf(post[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("No");
            }
        }
    }

    private static void createTree(int low, int high) {
        if (high >= low) {
            int m = middle[K++];
            if (m == -1 || m < low || m > high) {
                flag = false;
                return;
            }
            createTree(low, m - 1);
            createTree(m + 1, high);
            post[M++] = inOrderArr[m];
        }
    }

}
/**************************************************************
 Problem: 1385
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:14816 kb
 ****************************************************************/




