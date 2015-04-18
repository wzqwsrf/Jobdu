
// 题目1037：Powerful Calculator

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月18日22:27:48
 * @url:http://ac.jobdu.com/problem.php?pid=1037
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Prob1037 {
    /*
     * 1037
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            BigInteger biga = new BigInteger(a);
            BigInteger bigb = new BigInteger(b);
            System.out.println(biga.add(bigb).toString());
            System.out.println(biga.subtract(bigb));
            System.out.println(biga.multiply(bigb));
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1037
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15628 kb
 * **************************************************************
 */