
// 题目1098：字母统计

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1098
 */

import java.util.Scanner;

public class Main {
    /*
     * 1098
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            int array[] = new int[26];
            int len = input.length();
            for (int i = 0; i < len; i++) {
                char a = input.charAt(i);
                if (a >= 'A' && a <= 'Z') {
                    array[a - 'A']++;
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println((char) ('A' + i) + ":" + array[i]);
            }
        }
    }
}
/**************************************************************
 Problem: 1098
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:17468 kb
 ****************************************************************/




