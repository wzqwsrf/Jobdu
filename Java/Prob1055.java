
// 题目1055：数组逆置

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:46:19
 * @url:http://ac.jobdu.com/problem.php?pid=1055
 */

import java.util.Scanner;

public class Prob1055 {

    /*
     * 1055
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.next();
            char[] array = ab.toCharArray();
            int length = array.length;
            for (int i = 0; i < length; i++) {
                System.out.print(array[length - 1 - i]);
            }
            System.out.println();
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1055
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15488 kb
 * **************************************************************
 */