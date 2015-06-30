
// 题目1367：二叉搜索树的后序遍历序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1367
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1367
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
            boolean flag = isBinaryTree(array, 0, n - 1);
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

    private static boolean isBinaryTree(int[] array, int left, int right) {
        if (left >= right) {
            return true;
        }
        int root = array[right];
        int mid = 0;
        for (mid = left; mid < right; mid++) {
            if (array[mid] < root) {
                continue;
            } else {
                break;
            }
        }
        for (int i = mid; i < right; i++) {
            if (array[i] < root) {
                return false;
            }
        }

        if (!isBinaryTree(array, left, mid - 1)) {
            return false;
        }
        if (!isBinaryTree(array, mid + 1, right)) {
            return false;
        }

        return true;
    }
}

/**************************************************************
 Problem: 1367
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:420 ms
 Memory:25304 kb
 ****************************************************************/




