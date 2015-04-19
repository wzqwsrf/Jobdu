
// 题目1051：数字阶梯求和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:44:13
 * @url:http://ac.jobdu.com/problem.php?pid=1051
 */

import java.util.Scanner;

public class Prob1051 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int n = scanner.nextInt();
            int[] array = new int[n + 1];
            for (int i = n; i > 0; i--) {
                array[i] += i * a;
                if (array[i] >= 10) {
                    array[i - 1] += array[i] / 10;
                    array[i] = array[i] % 10;
                }
            }
            if (array[0] == 0) {
                for (int i = 1; i < array.length; i++) {
                    System.out.print(array[i]);
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
            }
            System.out.println();

        }
    }
}
/**
 * ***********************************************************
 * Problem: 1051
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15464 kb
 * **************************************************************
 */