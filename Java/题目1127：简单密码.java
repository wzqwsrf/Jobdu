
// 题目1127：简单密码

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1127
 */

import java.util.Scanner;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String start = scanner.nextLine();
            if (start.equals("ENDOFINPUT")) {
                break;
            }
            String ab = scanner.nextLine();
            String end = scanner.nextLine();
            char[] array = ab.toCharArray();
            for (int i = 0; i < array.length; i++) {
                char c = array[i];
                if (c >= 'A' && c <= 'Z') {
                    if (c >= 'F') {
                        c = (char) (c - 5);
                    } else {
                        c = (char) (c + 21);
                    }
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
/**************************************************************
 Problem: 1127
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:180 ms
 Memory:20092 kb
 ****************************************************************/




