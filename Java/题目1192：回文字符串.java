
// 题目1192：回文字符串

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1192
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
     * 1192
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            char[] arrayA = a.toCharArray();
            int size = arrayA.length;
            char[] arrayB = new char[size];
            String result = "";
            for (int i = 0; i < size; i++) {
                arrayB[i] = arrayA[size - 1 - i];
                result += String.valueOf(arrayB[i]);
            }
            if (a.equals(result)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
/**************************************************************
 Problem: 1192
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1000 ms
 Memory:187632 kb
 ****************************************************************/




