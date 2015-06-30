
// 题目1121：首字母大写

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1121
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
            String ab = scanner.nextLine();
            char[] array = ab.toCharArray();
            if (array[0] >= 'a' && array[0] <= 'z') {
                array[0] = (char) (array[0] - 32);
            }
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == ' ' || array[i - 1] == '\t'
                        || array[i - 1] == '\r' || array[i - 1] == '\n')
                    if (array[i] >= 'a' && array[i] <= 'z')
                        array[i] = (char) (array[i] - 32);
            }
            System.out.println(array);
        }
    }
}

/**************************************************************
 Problem: 1121
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15504 kb
 ****************************************************************/




