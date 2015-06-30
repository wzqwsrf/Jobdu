
// 题目1498：寻找表达式

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1498
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1498
     */
    private static String[] array = { " ", "+", "-" };

    private static String symArr[];

    private static int n;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            symArr = new String[n + 1];
            dfs(1, 2, 1);
        }
    }

    private static void dfs(int sum, int curNum, int lastNum) {
        if (curNum > n + 1) {
            return;
        }

        if (curNum == n + 1 && sum != 0) {
            return;
        }

        if (curNum == n + 1 && sum == 0) {
            symArr[n] = "";
            for (int i = 1; i < n + 1; i++) {
                System.out.printf(i + symArr[i]);
            }
            System.out.println();
        }
        symArr[curNum - 1] = array[0];
        int temp = lastNum > 0 ? curNum : -curNum;
        if (curNum < 10) {
            dfs(sum + lastNum * 10 + temp - lastNum, curNum + 1, lastNum * 10
                    + temp);
        } else {
            dfs(sum + lastNum * 100 + temp - lastNum, curNum + 1, lastNum * 100
                    + temp);
        }
        symArr[curNum - 1] = array[1];
        dfs(sum + curNum, curNum + 1, curNum);
        symArr[curNum - 1] = array[2];
        dfs(sum - curNum, curNum + 1, -curNum);
    }
}
/**************************************************************
 Problem: 1498
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2570 ms
 Memory:61068 kb
 ****************************************************************/




