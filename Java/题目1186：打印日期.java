
// 题目1186：打印日期

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1186
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /*
     * 1186
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        while (scanner.hasNext()) {
            int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (m % 400 == 0 || (m % 4 == 0 && m % 100 != 0)) {
                month[1] = 29;
            }
            int i = 0;
            int temp = n;
            while (i < 12 && temp > month[i]) {
                temp -= month[i];
                i++;
            }
            String result = m + "-" + (i + 1) + "-" + temp;
            Date date = df.parse(result);
            System.out.println(df.format(date));
        }
    }
}

/**************************************************************
 Problem: 1186
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2170 ms
 Memory:78168 kb
 ****************************************************************/




