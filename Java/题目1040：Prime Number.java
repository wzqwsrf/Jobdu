
// 题目1040：Prime Number

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1040
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/35781195
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1040 2014年6月29日11:08:22
     */
    private static int len;

    public static void main(String[] args) throws Exception {
        len = 200000;
        int array[] = getPrimeArray();
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int k = (int) st.nval;
            int count = 0;
            for (int i = 1; i < len; i++) {
                if (array[i] != 0) {
                    count++;
                }
                if (count == k) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static int[] getPrimeArray() {
        int array[] = new int[len];
        for (int i = 1; i < len; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        array[1] = 0;
        array[2] = 1;
        for (int i = 2; i < len; i++) {
            if (array[i] == 1) {
                for (int j = 2 * i; j < len; j += i) {
                    array[j] = 0;
                }
            }
        }
        return array;
    }
}
/**************************************************************
 Problem: 1040
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:17264 kb
 ****************************************************************/




