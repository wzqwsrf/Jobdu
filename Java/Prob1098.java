
// 题目1098：字母统计

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年05月11日17:59:22
 * @url:http://ac.jobdu.com/problem.php?pid=1098
 */

import java.util.Scanner;

public class Prob1098 {
    /*
     * 1098
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.next();
            int array[] = new int[26];
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
            for (int i = 0; i < ab.length(); i++) {
                char a = ab.charAt(i);
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
/**
 * ***********************************************************
 * Problem: 1098
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:110 ms
 * Memory:17460 kb
 * **************************************************************
 */