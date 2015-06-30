
// 题目1068：球的半径和体积

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1068
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
     * 1143
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        while (scanner.hasNext()) {
            double x0 = scanner.nextDouble();
            double y0 = scanner.nextDouble();
            double z0 = scanner.nextDouble();
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double z1 = scanner.nextDouble();

            double rad = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0)
                    * (y1 - y0) + (z1 - z0) * (z1 - z0));
            double v = 4.0 * Math.acos(-1) * rad * rad * rad / 3.0;
            System.out.println(df.format(rad) + " " + df.format(v));
        }
    }
}
/**************************************************************
 Problem: 1068
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:510 ms
 Memory:38656 kb
 ****************************************************************/




