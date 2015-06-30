
// 题目1138：进制转换

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1138
 */

import java.math.BigInteger;
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
            String ab = scanner.nextLine();
            System.out.println(new BigInteger(ab).toString(2));
        }
    }
}
/**************************************************************
 Problem: 1138
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1020 ms
 Memory:80724 kb
 ****************************************************************/




