
// 题目1128：求平均年龄

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1128
 */

import java.text.DecimalFormat;
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
     * 1128
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int array[] = new int[n];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                //				if (array[i]>=15&&array[i]<=25) {
                sum += array[i];
                //				}

            }
            float ac = (float) sum / n;
            System.out.println(new String(df.format(ac)));
        }
    }

}
/**************************************************************
 Problem: 1128
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:670 ms
 Memory:71652 kb
 ****************************************************************/




