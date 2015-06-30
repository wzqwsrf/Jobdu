
// 题目1183：守形数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1183
 */

import java.util.Scanner;

public class Main {
    /*
     * 1183
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int squareN = N * N;
            if (N < 10 && (squareN) % 10 == N) {
                System.out.println("Yes!");
            } else if (N < 100 && (squareN) % 100 == N) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}

/**************************************************************
 Problem: 1183
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:18704 kb
 ****************************************************************/




