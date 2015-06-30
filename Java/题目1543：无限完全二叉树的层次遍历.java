
// 题目1543：无限完全二叉树的层次遍历

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1543
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    /*
     * 1543
     */
    private static BigInteger zero = new BigInteger("0");

    private static BigInteger one = new BigInteger("1");

    private static BigInteger two = new BigInteger("2");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            while (t > 0) {
                int type = scanner.nextInt();
                if (type == 1) {
                    BigInteger n = scanner.nextBigInteger();
                    int path[] = new int[100];
                    int k = 0;
                    while (n.compareTo(one) != 0) {
                        if (n.mod(two).compareTo(zero) == 0) {
                            path[k] = 0;
                        } else {
                            path[k] = 1;
                        }
                        n = n.divide(two);
                        k++;
                    }
                    BigInteger p = new BigInteger("1");
                    BigInteger q = new BigInteger("1");
                    for (int i = k - 1; i >= 0; i--) {
                        if (path[i] == 0) {
                            q = q.add(p);
                        } else {
                            p = p.add(q);
                        }
                    }
                    System.out.println(p + " " + q);
                } else if (type == 2) {
                    BigInteger p = scanner.nextBigInteger();
                    BigInteger q = scanner.nextBigInteger();
                    int path[] = new int[100];
                    int k = 0;
                    while (p.compareTo(q) != 0) {
                        if (p.compareTo(q) == 1) {
                            path[k] = 1;
                            p = p.subtract(q);
                        } else {
                            path[k] = 0;
                            q = q.subtract(p);
                        }
                        k++;
                    }
                    BigInteger top = new BigInteger("0");
                    BigInteger temp = new BigInteger("1");
                    BigInteger child = new BigInteger("1");
                    for (int i = k - 1; i >= 0; i--) {
                        top = top.add(temp);
                        child = child.subtract(one).multiply(two).add(one).add(
                                new BigInteger(path[i] + ""));
                        temp = temp.multiply(two);
                    }
                    System.out.println(child.add(top));
                }
                t--;
            }
        }
    }
}
/**************************************************************
 Problem: 1543
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:680 ms
 Memory:25776 kb
 ****************************************************************/




