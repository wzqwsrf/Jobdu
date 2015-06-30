
// 题目1362：左旋转字符串（Move!Move!!Move!!!）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1362
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
     * 1362
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            int num = scanner.nextInt();
            int length = a.length();
            if (num > length) {
                num = num % length;
            }
            String newA = a.substring(0, num);
            String newB = a.substring(num, a.length());
            System.out.println(newB + newA);
        }
    }
}
/**************************************************************
 Problem: 1362
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1430 ms
 Memory:51676 kb
 ****************************************************************/




