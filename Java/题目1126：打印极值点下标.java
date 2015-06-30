
// 题目1126：打印极值点下标

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1126
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1126
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int m = (int) st.nval;
                int array[] = new int[m];
                for (int j = 0; j < m; j++) {
                    st.nextToken();
                    array[j] = (int) st.nval;
                }

                StringBuffer sb = new StringBuffer();
                if (array[0] != array[1]) {
                    sb.append(0 + " ");
                }
                int j = 1;
                while (j < m - 1) {
                    if ((array[j] > array[j - 1] && array[j] > array[j + 1])
                            || (array[j] < array[j - 1] && array[j] < array[j + 1])) {
                        sb.append(j + " ");
                    }
                    j++;
                }
                if (array[m - 1] != array[m - 2]) {
                    sb.append(m - 1);
                }

                System.out.println(sb.toString().trim());
            }
        }
    }
}
/**************************************************************
 Problem: 1126
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:290 ms
 Memory:27460 kb
 ****************************************************************/




