
// 题目1510：替换空格

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1510
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
     * 1510
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            System.out.println(a.replaceAll(" ", "%20"));
        }
    }
}
/**************************************************************
 Problem: 1510
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:900 ms
 Memory:48196 kb
 ****************************************************************/




