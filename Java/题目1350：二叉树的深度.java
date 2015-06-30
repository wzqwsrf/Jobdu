
// 题目1350：二叉树的深度

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1350
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1350
     */
    private static int leftArr[];

    private static int rightArr[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            leftArr = new int[n + 1];
            rightArr = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                leftArr[i] = (int) st.nval;
                st.nextToken();
                rightArr[i] = (int) st.nval;
            }
            int deep = getTreeDeep(1);
            System.out.println(deep + 1);
        }
    }

    private static int getTreeDeep(int node) {
        int left = leftArr[node];
        int right = rightArr[node];
        if (left == -1 && right == -1) {
            return 0;
        } else {
            int a = (left == -1) ? 0 : getTreeDeep(left);
            int b = (right == -1) ? 0 : getTreeDeep(right);
            return Math.max(a + 1, b + 1);
        }
    }
}

/**************************************************************
 Problem: 1350
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:490 ms
 Memory:14564 kb
 ****************************************************************/




