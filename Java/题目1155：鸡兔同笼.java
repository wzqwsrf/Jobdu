
// 题目1155：鸡兔同笼

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1155
 */

import java.util.Scanner;

public class Main {
    /*
     * 1155
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num % 2 != 0) {
                    System.out.printf("%d %d\n", 0, 0);
                } else {
                    System.out.printf("%d %d\n", (num + 2) / 4, num / 2);
                }
            }
        }
    }
}
/**************************************************************
 Problem: 1155
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15608 kb
 ****************************************************************/




