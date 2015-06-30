
// 题目1506：求1+2+3+...+n

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1506
 */

import java.util.Scanner;

public class Main {
    /*
     * 1476 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println((n + 1) * n / 2);
        }
    }
}

/**************************************************************
 Problem: 1506
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1440 ms
 Memory:36092 kb
 ****************************************************************/




