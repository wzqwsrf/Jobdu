
// 题目1254：N皇后问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1254
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/18315137
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1254
     */
    public static int count;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            count = 0;
            solveNQueens(n);
            System.out.println(count);
        }
    }

    public static void solveNQueens(int n) {
        if (n <= 0) {
            return;
        }
        int[] queen = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            queen[1] = i;
            dfs(queen, 2, n);
        }
    }

    public static void dfs(int queen[], int line, int n) {
        if (line == n + 1) {
            count++;
            return;
        }
        for (int i = 1; i < n + 1; i++) {
            if (valid(line, i, queen)) {
                queen[line] = i;
                dfs(queen, line + 1, n);
                queen[line] = 0;
            }
        }
    }

    public static boolean valid(int row, int col, int[] queen) {
        for (int i = 1; i < row; i++) {
            if (queen[i] != 0
                    && (queen[i] == col || Math.abs(i - row) == Math
                            .abs(queen[i] - col)))
                return false;
        }
        return true;
    }
}

/**************************************************************
 Problem: 1254
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:2860 ms
 Memory:17600 kb
 ****************************************************************/




