
// 题目1156：谁是你的潜在朋友

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1156
 */

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
     * 1256
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int N = (int) st.nval;
            st.nextToken();
            int M = (int) st.nval;
            int[] arrayM = new int[200];
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                arrayM[array[i]]++;
            }
            for (int i = 0; i < N; i++) {
                if (arrayM[array[i]] != 1) {
                    System.out.println(arrayM[array[i]] - 1);
                } else {
                    System.out.println("BeiJu");
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1156
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:14680 kb
 ****************************************************************/




