
// 题目1203：IP地址

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1203
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = "((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))";
        Pattern pattern = Pattern.compile(ip);

        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                String inputIp = scanner.nextLine();
                boolean flag = pattern.matcher(inputIp).matches();
                if (flag) {
                    System.out.println("Yes!");
                } else {
                    System.out.println("No!");
                }
            }
        }

    }
}

/**************************************************************
 Problem: 1203
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:170 ms
 Memory:24388 kb
 ****************************************************************/




