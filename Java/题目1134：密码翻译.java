
// 题目1134：密码翻译

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1134
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                String a = scanner.nextLine();
                char[] array = a.toCharArray();
                for (int j = 0; j < array.length; j++) {
                    char c = array[j];
                    if (c >= 'a' && c <= 'z') {
                        if (c == 'z') {
                            c = 'a';
                        } else {
                            c = (char) (c + 1);
                        }
                    } else if (c >= 'A' && c <= 'Z') {
                        if (c == 'Z') {
                            c = 'A';
                        } else {
                            c = (char) (c + 1);
                        }
                    }
                    System.out.print(c);
                }
                System.out.println();
            }

        }
    }
}

/**************************************************************
 Problem: 1134
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:15748 kb
 ****************************************************************/




