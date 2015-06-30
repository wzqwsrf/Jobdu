
// 题目1357：疯狂地Jobdu序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1357
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1357
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            long n = (long) st.nval;
            double tempNum = (Math.sqrt(1 + 8 * n) - 1.0) / 2;
            long num = (long) Math.ceil(tempNum);
            System.out.println(num);
        }
    }
}
/**************************************************************
 Problem: 1357
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:840 ms
 Memory:30616 kb
 ****************************************************************/




