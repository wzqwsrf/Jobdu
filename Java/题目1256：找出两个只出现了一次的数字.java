
// 题目1256：找出两个只出现了一次的数字

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1256
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1256
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int N = (int) st.nval;
            int[] array = new int[N];
            int result = 0;
            for (int i = 0; i < N; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                result ^= array[i];
            }

            int num = 0;
            while ((result & 1) == 0) {
                result = result >> 1;
                num++;
            }
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < N; i++) {
                if (((array[i] >> num) & 1) == 0) {
                    num1 ^= array[i];
                } else {
                    num2 ^= array[i];
                }
            }
            if (num1 > num2) {
                System.out.println(num2 + " " + num1);
            } else {
                System.out.println(num1 + " " + num2);
            }
        }
    }
}
/**************************************************************
 Problem: 1256
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:770 ms
 Memory:33104 kb
 ****************************************************************/




