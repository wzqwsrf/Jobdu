
// 题目1464：Hello World for U

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1464
 */

import java.util.Scanner;

public class Main {
    /*
     * 1464
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            int len = a.length();
            int n1 = 0;
            n1 = (len + 2) / 3;
            int actualNum = n1 - 1;
            StringBuffer sb = new StringBuffer();
            String middle = a.substring(actualNum, len - actualNum);
            int spaNum = middle.length() - 2;
            int i = 0;
            while (i < actualNum) {
                sb.append(a.charAt(i));
                int sap = 1;
                while (sap <= spaNum) {
                    sb.append(" ");
                    sap++;
                }
                sb.append(a.charAt(len - 1 - i) + "\n");
                i++;
            }
            sb.append(middle);
            System.out.println(sb);
        }
    }
}
/**************************************************************
 Problem: 1464
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15652 kb
 ****************************************************************/




