
// 题目1077：最大序列和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月22日23:13:14
 * @url:http://ac.jobdu.com/problem.php?pid=1077
 */

import java.util.Scanner;

public class Prob1077 {

    /*
    * 1077
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }
            long array[] = new long[N];
            array[0] = scanner.nextLong();
            long sum = array[0];
            long currentSum = array[0];
            for (int i = 1; i < N; i++) {
                array[i] = scanner.nextLong();
                if (currentSum < 0) {
                    currentSum = array[i];
                } else {
                    currentSum += array[i];
                }
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
            System.out.println(sum);
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1077
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1440 ms
 * Memory:164352 kb
 * **************************************************************
 */