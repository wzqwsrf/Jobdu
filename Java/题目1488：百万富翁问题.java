
// 题目1488：百万富翁问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1488
 */

public class Main {

    /*
     * 1488
     */
    public static void main(String[] args) {
        int begin = 1;
        int result = 1;
        for (int i = 2; i <= 30; i++) {
            begin *= 2;
            result += begin;
        }
        System.out.println(10 * 30 + " " + result);
    }
}

/**************************************************************
 Problem: 1488
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14664 kb
 ****************************************************************/




