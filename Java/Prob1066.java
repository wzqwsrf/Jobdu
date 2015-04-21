
// 题目1066：字符串排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月21日23:12:29
 * @url:http://ac.jobdu.com/problem.php?pid=1066
 */

import java.util.Arrays;
import java.util.Scanner;

public class Prob1066 {
    /*
     * 1066
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.nextLine();
            char[] arrayA = a.toCharArray();
            Arrays.sort(arrayA);
            String result = "";
            for (int i = 0; i < arrayA.length; i++) {
                result += arrayA[i];

            }
            System.out.println(result);
        }
    }

}
/**
 * ***********************************************************
 * Problem: 1066
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1840 ms
 * Memory:174024 kb
 * **************************************************************
 */