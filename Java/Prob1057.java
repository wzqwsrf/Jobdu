
// 题目1057：众数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:47:54
 * @url:http://ac.jobdu.com/problem.php?pid=1057
 */

import java.util.Scanner;

public class Prob1057 {
    /*
     * 1057
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = 20;
            int array[] = new int[n];
            int newArray[] = new int[11];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                newArray[array[i]]++;
            }
            int max = 0;
            for (int i = 0; i < 11; i++) {
                if (newArray[i] > newArray[max]) {
                    max = i;
                }
            }
            System.out.println(max);
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1057
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:120 ms
 * Memory:18848 kb
 * **************************************************************
 */
