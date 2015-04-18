
// 题目1045：百鸡问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:46:06
 * @url:http://ac.jobdu.com/problem.php?pid=1045
 */

import java.util.Scanner;

public class Prob1045 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {
                    int sum = 14 * i + 8 * j;
                    if (sum <= (3 * n - 100)) {
                        System.out.println("x=" + i + ",y=" + j + ",z=" + (100 - i - j));
                    }

                }
            }
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1045
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:160 ms
 * Memory:19756 kb
 * **************************************************************
 */