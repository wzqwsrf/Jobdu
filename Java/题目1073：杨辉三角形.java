
// 题目1073：杨辉三角形

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1073
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
     * 1073
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int[] array = new int[n];
            array[0] = 1;

            StringBuffer sb = new StringBuffer();
            for (int i = 1; i < n; i++) {
                for (int j = i; j > 0; j--)
                    array[j] += array[j - 1];

                // 打印数字
                for (int k = 0; k < i; k++) {
                    sb.append(array[k]);
                    sb.append(" ");
                }
                sb.append(array[i]);
                if (i < n - 1) {
                    sb.append("\n");
                }
            }
            System.out.println(sb.toString());
        }
    }

}
/**************************************************************
 Problem: 1073
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:18056 kb
 ****************************************************************/




