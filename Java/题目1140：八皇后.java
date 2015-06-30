
// 题目1140：八皇后

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1140
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/18314753
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*
     * 1140
     */
    public static void main(String[] args) throws Exception {
        int n = 8;
//      count = 0;
        solveNQueens(n);
        StreamTokenizer st = new StreamTokenizer(
                new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int allNum = (int) st.nval;
            while (allNum > 0) {
                st.nextToken();
                int seq = (int) st.nval;
//              Collections.sort(arrList);
//              System.out.println(count);
                System.out.println(list.get(seq - 1));
                allNum--;
            }
        }
    }

    public static void solveNQueens(int n) {
        list = new ArrayList<String>();
        if (n <= 0) {
            return;
        }
        int[] queen = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            queen[1] = i;
            dfs(queen, 2, n);
        }
        Collections.sort(list);
    }

    public static ArrayList<String> list;

    public static void dfs(int queen[], int line, int n) {
        if (line == n + 1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i < n + 1; i++) {
                sb.append(queen[i]);
            }
            list.add(sb.toString());
            return;
        }
        for (int i = 1; i < n + 1; i++) {
            if (valid(line, i, queen)) {
                int array[] = new int[n + 1];
                for (int j = 1; j < n + 1; j++) {
                    array[j] = queen[j];
                }
                array[line] = i;
                dfs(array, line + 1, n);
            }
        }
    }

    public static boolean valid(int row, int col, int[] queen) {
        for (int i = 1; i < row; i++) {
            if (queen[i] != 0 && (queen[i] == col
                    || Math.abs(i - row) == Math.abs(queen[i] - col)))
                return false;
        }
        return true;
    }
}
/**************************************************************
 * Problem: 1140
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:130 ms
 * Memory:21604 kb
 ****************************************************************/


                        


