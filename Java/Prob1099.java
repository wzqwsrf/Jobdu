
// 题目1099：后缀子串排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年05月11日18:00:40
 * @url:http://ac.jobdu.com/problem.php?pid=1099
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Prob1099 {
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
/**
 * ***********************************************************
 * Problem: 1099
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15524 kb
 * **************************************************************
 */