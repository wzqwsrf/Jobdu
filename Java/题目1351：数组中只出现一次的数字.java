
// 题目1351：数组中只出现一次的数字

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1351
 */

import java.io.IOException;
import java.io.StreamTokenizer;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
    /*
     * 1351
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);
        int[] array = new int[1000000];
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                result ^= array[i];
            }

            int num = 0;
            while ((result & 1) == 0 && num < 32) {
                result = result >> 1;
                num++;
            }
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < n; i++) {
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
 Problem: 1351
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:970 ms
 Memory:25132 kb
 ****************************************************************/




