
// 题目1466：排列与二进制

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1466
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
     * 1466
     */
    public static void main(String[] args) throws Exception {
        int array[] = new int[10001];
        int i, j;
        for (i = 1; i <= array.length; i++) {
            j = i;
            while ((j & 1) == 0) {
                array[i]++;
                j >>= 1;
            }
        }
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            st.nextToken();
            int m = (int) st.nval;
            int count = 0;
            for (i = 0; i < m; i++) {
                count += array[n - i]; // 若10，依次加上10,9,8,7,6的二进制末尾0的个数
            }
            System.out.println(count);
        }
    }
}

/**************************************************************
 Problem: 1466
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15984 kb
 ****************************************************************/




