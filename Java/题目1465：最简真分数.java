
// 题目1465：最简真分数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1465
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1465 排序 遍历
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            Arrays.sort(array);
            int num = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == 1 && array[j] != 1) {
                        num++;
                        continue;
                    }
                    if (array[j] % array[i] != 0) {
                        boolean flag = checkDivisor(array[j], array[i]);
                        if (flag) {
                            num++;
                        }
                    }
                }
            }
            System.out.println(num);
        }
    }

    private static boolean checkDivisor(int a, int b) {
        for (int i = 2; i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/**************************************************************
 Problem: 1465
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1440 ms
 Memory:23688 kb
 ****************************************************************/




