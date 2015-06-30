
// 题目1182：统计单词

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1182
 */

import java.util.Scanner;
import java.util.regex.Matcher;
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String result = "";
            Pattern p = Pattern.compile("[' ']+");
            String ab = scanner.nextLine();
            ab = ab.substring(0, ab.length() - 1).trim();
            Matcher m = p.matcher(ab);
            ab = m.replaceAll(" ");
            String[] array = ab.split(Pattern.quote(" "));
            for (int i = 0; i < array.length; i++) {
                int length = array[i].length();
                result += length + " ";
            }
            System.out.println(result.trim());
        }
    }
}
/**************************************************************
 Problem: 1182
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:430 ms
 Memory:33884 kb
 ****************************************************************/




