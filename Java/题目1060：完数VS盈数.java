
// 题目1060：完数VS盈数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1060
 */

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    public static void main(String[] args) {
        String perNum = "E: ";
        String surNum = "G: ";
        for (int i = 2; i < 61; i++) {
            int num = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    num += j;
                }
            }
            if (num == i) {
                perNum += i + " ";
            } else if (num > i) {
                surNum += i + " ";
            }
        }
        System.out.println(perNum.trim());
        System.out.println(surNum.trim());
    }
}

/**************************************************************
 Problem: 1060
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14548 kb
 ****************************************************************/




