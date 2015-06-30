
// 题目1375：陈博的完美主义（25分）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1375
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/26221521
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     *2014年5月19日10:25:09
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int numArr[] = new int[n + 1];
            int num = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int tempNum = (int) st.nval;
                if (tempNum == Integer.MAX_VALUE || tempNum < 1 || tempNum > n) {
                    num++;
                } else {
                    if (numArr[tempNum] == 0) {
                        numArr[tempNum] = 1;
                    } else {
                        num++;
                    }
                }
            }
            System.out.println(num);
        }
    }
}

/**************************************************************
 Problem: 1375
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:590 ms
 Memory:29504 kb
 ****************************************************************/




