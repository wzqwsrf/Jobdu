
// 题目1058：反序输出

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1058
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
            String ab = scanner.next();
            String result = "";
            for (int i = ab.length() - 1; i >= 0; i--) {
                result += ab.charAt(i);
            }
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1058
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1320 ms
 Memory:97488 kb
 ****************************************************************/




