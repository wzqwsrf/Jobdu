
// 题目1083：特殊乘法

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1083
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
    /*
     * 1083
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            int result = 0;
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    result += (a.charAt(i) - '0') * (b.charAt(j) - '0');
                }
            }
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1083
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15404 kb
 ****************************************************************/




