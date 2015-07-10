
// 题目1099：后缀子串排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1099 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17221537
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
     * 1099
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.next();
            Set<String> set = new TreeSet<String>();
            int length = ab.length();
            for (int i = 0; i < length; i++) {
                set.add(ab.substring(i, length));
            }
            for (String result : set) {
                System.out.println(result);
            }
        }
    }
}
/**************************************************************
 Problem: 1099
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15524 kb
 ****************************************************************/




