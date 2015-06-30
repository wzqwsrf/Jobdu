
// 题目1055：数组逆置

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1055
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
     * 1055
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.next();
            char[] array = ab.toCharArray();
            int length = array.length;
            for (int i = 0; i < length; i++) {
                System.out.print(array[length - 1 - i]);
            }
            System.out.println();
        }
    }
}

/**************************************************************
 Problem: 1055
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15488 kb
 ****************************************************************/




