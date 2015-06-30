
// 题目1111：单词替换

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1111
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
     * 1111
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            String[] array = s.split(Pattern.quote(" "));
            String result = "";
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(a)) {
                    array[i] = b;
                }
                result += array[i] + " ";
            }
            System.out.println(result.trim());
        }
    }
}
/**************************************************************
 Problem: 1111
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15476 kb
 ****************************************************************/




