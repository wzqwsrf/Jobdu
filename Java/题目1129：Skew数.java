
// 题目1129：Skew数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1129
 */

import java.util.Scanner;

public class Main {
    /*
     * 1129
     */
    public static void main(String[] args) throws Exception {

        long arrayNum[] = new long[50];
        arrayNum[0] = 1;
        for (int i = 1; i < 50; i++) {
            arrayNum[i] = 2 * arrayNum[i - 1];
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            if (a.equals("0")) {
                break;
            }
            char[] array = a.toCharArray();
            int len = array.length;
            int num = 0;
            for (int i = len - 1; i >= 0; i--) {
                char c = array[len - 1 - i];
                num += (c - '0') * (arrayNum[i + 1] - 1);
            }
            System.out.println(num);
        }
    }

}
/**************************************************************
 Problem: 1129
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:270 ms
 Memory:28892 kb
 ****************************************************************/




