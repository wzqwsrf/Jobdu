
// 题目1208：10进制 VS 2进制

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1208
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
    /*
     * 1208
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String twoStr = new BigInteger(a).toString(2);
            char[] array = twoStr.toCharArray();
            String threeStr = "";
            for (int i = array.length - 1; i >= 0; i--) {
                threeStr += array[i];
            }
            String result = new BigInteger(threeStr, 2).toString(10);
            System.out.println(result);
        }
    }
}
/**************************************************************
 Problem: 1208
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:67032 kb
 ****************************************************************/




