
// 题目1079：手机键盘

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1079
 */

import java.util.Scanner;

public class Main {
    /*
     * 1079
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spendTime[] = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2,
                3, 4, 1, 2, 3, 1, 2, 3, 4 };
        int distance[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 6, 6, 6, 7, 7,
                7, 7, 8, 8, 8, 9, 9, 9, 9 };
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            int time = 0;
            for (int i = 0; i < a.length(); i++) {
                time += spendTime[a.charAt(i) - 'a'];
                if (i >= 1
                        && distance[a.charAt(i) - 'a'] == distance[a
                                .charAt(i - 1) - 'a']) {
                    time += 2;
                }
            }
            System.out.println(time);
        }
    }

}
/**************************************************************
 Problem: 1079
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:240 ms
 Memory:27132 kb
 ****************************************************************/




