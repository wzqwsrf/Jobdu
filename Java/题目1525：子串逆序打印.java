
// 题目1525：子串逆序打印

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1525
 */

import java.util.Scanner;
import java.util.regex.Pattern;

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
     * 1525
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String n = scanner.nextLine();
            if (n.equals("0")) {
                break;
            }
            String a = scanner.nextLine();
            String ab = a.replaceAll("['   ']+", " ");
            String[] array = ab.split(Pattern.quote(" "));
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                int length = array[i].length();
                for (int j = 0; j < length; j++) {
                    sb.append(array[i].charAt(length - 1 - j));
                }
                sb.append(" ");
            }
            if (a.startsWith(" ") && a.endsWith(" ")) {
                System.out.println(sb.toString());
            } else if (a.startsWith(" ")) {
                System.out.println(" " + sb.toString().trim());
            } else if (a.endsWith(" ")) {
                System.out.println(sb.toString());
            } else {
                System.out.println(sb.toString().trim());
            }

        }
    }
}
/**************************************************************
 Problem: 1525
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1920 ms
 Memory:37008 kb
 ****************************************************************/




