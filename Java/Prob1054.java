
// 题目1054：字符串内排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月18日10:52:01
 * @url：http://ac.jobdu.com/problem.php?pid=1054
 * 内置排序方法可以直接实现
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17221013
 */

import java.util.Arrays;
import java.util.Scanner;

public class Prob1054 {
    /*
     * 1054
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
/**************************************************************
 Problem: 1054
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15988 kb
 ****************************************************************/