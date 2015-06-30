
// 题目1185：特殊排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1185
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17225139
 */

import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int N = (int) st.nval;
            long[] array = new long[N];
            for (int i = 0; i < N; i++) {
                st.nextToken();
                array[i] = (long) st.nval;
            }
            if (N == 1) {
                System.out.println(array[0]);
                System.out.println(-1);
            } else {
                Arrays.sort(array);
                StringBuffer sb = new StringBuffer();
                sb.append(array[N - 1] + "\n");
                for (int i = 0; i < N - 2; i++) {
                    sb.append(array[i] + " ");
                }
                sb.append(array[N - 2]);
                System.out.println(sb.toString());
            }
        }
    }
}

/**************************************************************
 Problem: 1185
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:300 ms
 Memory:31956 kb
 ****************************************************************/




