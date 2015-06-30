
// 题目1105：字符串的反码

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1105
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
     * 1105
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.nextLine();
            if (a.equals("!")) {
                break;
            }
            char[] arrayA = a.toCharArray();
            for (int i = 0; i < arrayA.length; i++) {
                char c = arrayA[i];
                char temp = c;
                if (c >= 'a' && c <= 'z') {
                    temp = (char) ('z' + 'a' - c);
                } else if (c >= 'A' && c <= 'Z') {
                    temp = (char) ('Z' + 'A' - c);
                }
                arrayA[i] = temp;
                System.out.print(arrayA[i]);
            }
            System.out.println();
        }
    }

}
/**************************************************************
 Problem: 1105
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15428 kb
 ****************************************************************/




