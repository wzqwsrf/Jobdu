
// 题目1484：Mileage Bank

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1484
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/27695553
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1484
     * 2014年5月30日17:04:12
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String currLine = scanner.nextLine();
            if (currLine.equals("#")) {
                break;
            }
            int finalMiles = 0;
            while (!currLine.equals("0")) {
                String array[] = currLine.split(Pattern.quote(" "));
                int actualMiles = Integer.parseInt(array[2]);
                String claCode = array[3];
                if (claCode.equals("F")) {
                    finalMiles += actualMiles * 2;
                } else if (claCode.equals("B")) {
                    finalMiles += actualMiles
                            + (actualMiles % 2 == 0 ? actualMiles / 2
                                    : actualMiles / 2 + 1);
                } else if (claCode.equals("Y")) {
                    finalMiles += (actualMiles >= 1 && actualMiles <= 500) ? 500
                            : actualMiles;
                }
                currLine = scanner.nextLine();
            }
            System.out.println(finalMiles);
        }
    }
}
/**************************************************************
 Problem: 1484
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:230 ms
 Memory:26504 kb
 ****************************************************************/




