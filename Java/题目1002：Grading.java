
// 题目1002：Grading

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1002
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int t = scanner.nextInt();
            int g1 = scanner.nextInt();
            int g2 = scanner.nextInt();
            int g3 = scanner.nextInt();
            int gj = scanner.nextInt();

            double finalResult;
            int tolerance1 = Math.abs(g1 - g2);
            if (tolerance1 <= t) {
                finalResult = new BigDecimal(g1 + g2).divide(new BigDecimal(2))
                        .doubleValue();
            } else {

                int tolerance2 = Math.abs(g1 - g3);
                int tolerance3 = Math.abs(g2 - g3);
                if ((tolerance2 <= t && tolerance3 > t)
                        || (tolerance3 <= t && tolerance2 > t)) {
                    if (tolerance2 >= tolerance3) {
                        finalResult = new BigDecimal(g3 + g2).divide(
                                new BigDecimal(2)).doubleValue();
                    } else {
                        finalResult = new BigDecimal(g3 + g1).divide(
                                new BigDecimal(2)).doubleValue();
                    }

                } else if (tolerance2 <= t && tolerance3 <= t) {
                    finalResult = Math.max(Math.max(g1, g2), g3);
                } else {
                    finalResult = gj;
                }
            }
            System.out.println(finalResult);
        }
    }
}

/**************************************************************
 Problem: 1002
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:17720 kb
 ****************************************************************/




