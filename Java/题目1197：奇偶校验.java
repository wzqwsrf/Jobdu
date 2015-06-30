
// 题目1197：奇偶校验

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1197
 */

import java.util.Scanner;

public class Main {
    /*
     * 1197
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            int len = a.length();
            for (int i = 0; i < len; i++) {
                char c = a.charAt(i);
                int num = c;
                int sum = 0;
                int numArr[] = new int[8];
                for (int j = 7; j >= 0; j--) {
                    int res = num % 2;
                    if (res == 1) {
                        sum++;
                    }
                    numArr[j] = res;
                    num /= 2;
                }
                if (sum % 2 == 0) {
                    numArr[0] = 1;
                }

                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < 8; j++) {
                    sb.append(numArr[j]);
                }
                System.out.println(sb);
            }
        }
    }
}
/**************************************************************
 Problem: 1197
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:810 ms
 Memory:47188 kb
 ****************************************************************/




