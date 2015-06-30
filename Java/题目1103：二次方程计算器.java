
// 题目1103：二次方程计算器

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1103
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1103
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expression = scanner.next();
            String regex[] = { "([\\+\\-]?)(\\d*)x\\^2", "([\\+\\-]?)(\\d*)x",
                    "([\\+\\-]?)(\\d+)" };
            int abcArr[] = new int[3];
            StringBuffer sb = new StringBuffer(expression);
            for (int i = 0; i < 3; i++) {
                Pattern pattern = Pattern.compile(regex[i]);
                Matcher m = pattern.matcher(sb);
                while (m.find()) {
                    String m1 = m.group(1);
                    String m2 = m.group(2);
                    int index = sb.indexOf("=");
                    int value = 1;
                    if (m1.equals("-")) {
                        if ("".equals(m2)) {
                            value = -1;
                        } else {
                            value = -Integer.parseInt(m2);
                        }
                    } else {
                        if ("".equals(m2)) {
                            value = 1;
                        } else {
                            value = Integer.parseInt(m2);
                        }
                    }

                    if (m.start() < index) {
                        abcArr[i] += value;
                    } else {
                        abcArr[i] -= value;
                    }
                    sb.replace(m.start(), m.end(), "").toString();
                    m.reset();
                }
            }
            int disc = abcArr[1] * abcArr[1] - 4 * abcArr[0] * abcArr[2];
            if (disc < 0) {
                System.out.println("No Solution");
                continue;
            }
            double b24ac = Math.sqrt(disc);
            double answer1 = (-abcArr[1] + b24ac) / (2 * abcArr[0]);
            double answer2 = (-abcArr[1] - b24ac) / (2 * abcArr[0]);

            System.out.printf("%.2f %.2f\n", Math.min(answer1, answer2), Math
                    .max(answer1, answer2));
        }
    }
}
/**************************************************************
 Problem: 1103
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15652 kb
 ****************************************************************/




