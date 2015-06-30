
// 题目1374：所有员工年龄排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1374
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17223275
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
     * 1374
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int[] array = new int[100];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int num = (int) st.nval;
                array[num]++;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < array[i]; j++) {
                    sb.append(i);
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
/**************************************************************
 Problem: 1374
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1630 ms
 Memory:58436 kb
 ****************************************************************/




