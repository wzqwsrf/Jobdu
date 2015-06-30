
// 题目1054：字符串内排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1054
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17221013
 */

import java.util.Arrays;
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




