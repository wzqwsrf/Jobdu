
// 题目1060：完数VS盈数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:50:42
 * @url:http://ac.jobdu.com/problem.php?pid=1060
 */

public class Prob1060 {

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

/**
 * ***********************************************************
 * Problem: 1060
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:70 ms
 * Memory:14548 kb
 * **************************************************************
 */