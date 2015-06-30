
// 题目1133：学分绩点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1133
 */

import java.math.BigDecimal;
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
            int num = scanner.nextInt();
            int point[] = new int[num];
            int score[] = new int[num];
            int sum = 0;
            for (int i = 0; i < num; i++) {
                point[i] = scanner.nextInt();
                sum += point[i];
            }
            double result = 0;
            for (int i = 0; i < num; i++) {
                score[i] = scanner.nextInt();
                result += getCredit(score[i]) * point[i];
            }
            BigDecimal aBigDecimal = new BigDecimal(result).divide(
                    new BigDecimal(sum), 2, BigDecimal.ROUND_HALF_UP);
            String re = aBigDecimal.toString();
            System.out.println(re);
        }

    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-9,下午01:20:19
     * @author wangzq
     * @version 3.0.0
     *
     * @param i
     * @return
     */
    private static double getCredit(int score) {
        if (score >= 90 && score <= 100)
            return 4.0;
        else if (score >= 85 && score <= 89)
            return 3.7;
        else if (score >= 82 && score <= 84)
            return 3.3;
        else if (score >= 78 && score <= 81)
            return 3.0;
        else if (score >= 75 && score <= 77)
            return 2.7;
        else if (score >= 72 && score <= 74)
            return 2.3;
        else if (score >= 68 && score <= 71)
            return 2.0;
        else if (score >= 64 && score <= 67)
            return 1.5;
        else if (score >= 60 && score <= 63)
            return 1.0;
        else
            return 0.0;
    }
}
/**************************************************************
 Problem: 1133
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:19048 kb
 ****************************************************************/




