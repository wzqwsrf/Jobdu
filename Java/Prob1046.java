
// 题目1046：求最大值

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:47:14
 * @url:http://ac.jobdu.com/problem.php?pid=1046
 */

import java.util.Scanner;

public class Prob1046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("max=" + max);
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1046
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15496 kb
 * **************************************************************
 */