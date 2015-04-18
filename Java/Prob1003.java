
// 题目1003：A+B

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月15日10:02:07
 * 简单加法，注意int有可能越界
 * @url:http://ac.jobdu.com/problem.php?pid=1003
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Prob1003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.nextLine();
            String abArray[] = ab.split(Pattern.quote(" "));
            long result = 0;
            for (int i = 0; i < abArray.length; i++) {
                String a = abArray[i].replace(",", "");
                result += Long.parseLong(a);
            }
            System.out.println(result);
        }
    }

}
/**
 * ***********************************************************
 * Problem: 1003
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:80 ms
 * Memory:15488 kb
 * ***************************************************************/