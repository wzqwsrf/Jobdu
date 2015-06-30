
// 题目1137：浮点数加法

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1137
 */

import java.util.Scanner;

public class Main {
    static String t1;

    static String x, y;

    static int f;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s1, s2;
        int n;

        while (cin.hasNext()) {
            n = cin.nextInt();
            for (int m = 0; m < n; m++) {
                x = null;
                y = x;
                t1 = "";
                s1 = cin.next();
                String a1, b1;
                if (!s1.contains(".")) {
                    a1 = s1;
                    b1 = "";
                } else {
                    a1 = s1.substring(0, s1.indexOf('.'));
                    b1 = s1.substring(s1.indexOf('.') + 1, s1.length());
                }

                String a2, b2;
                s2 = cin.next();
                if (!s2.contains(".")) {
                    a2 = s2;
                    b2 = "";
                } else {
                    a2 = s2.substring(0, s2.indexOf('.'));
                    b2 = s2.substring(s2.indexOf('.') + 1, s2.length());
                }

                int lb1 = b1.length();
                int lb2 = b2.length();
                t1 = "";
                int lb = 0;
                if (lb1 > lb2) {
                    lb = lb2;
                    t1 = b1.substring(lb2, lb1);
                    b1 = b1.substring(0, lb2);
                } else {
                    lb = lb1;
                    t1 = b2.substring(lb1, lb2);
                    b2 = b2.substring(0, lb1);
                }
                f = 0;
                add(b1, b2, lb, lb, -1);
                int la1 = a1.length();
                int la2 = a2.length();
                if (la1 >= la2) {
                    add(a1, a2, la1, la2, 1);
                } else {
                    add(a2, a1, la2, la1, 1);
                }
                y = y + t1;
                if (f > 0)
                    System.out.print(f);
                System.out.print(x);
                if (lb1 > 0 || lb2 > 0) {
                    int p = y.length() - 1;
                    while (p >= 0) {
                        if (y.charAt(p) == '0') {
                            --p;
                        } else {
                            break;
                        }
                    }
                    if (p < 0)
                        System.out.println();
                    else {
                        System.out.println("." + y.substring(0, p + 1));
                    }
                }
            }
        }
    }

    static int add(String ss1, String ss2, int len1, int len2, int flag) {
        char ss[] = new char[len1];
        int t = 0, i;
        for (i = 1; i <= len2; i++) {
            t = (ss1.charAt(len1 - i) - '0') + (ss2.charAt(len2 - i) - '0') + f;
            if (t >= 10) {
                f = 1;
                t = t % 10;
            } else
                f = 0;
            ss[len1 - i] = (char) (t + '0');
        }

        while (len1 - i >= 0) {
            t = (ss1.charAt(len1 - i) - '0') + f;
            if (t >= 10) {
                f = 1;
                t = t % 10;
            } else
                f = 0;
            ss[len1 - i] = (char) (t + '0');
            ++i;
        }

        if (flag == -1)
            y = String.valueOf(ss);
        else if (flag == 1) {
            x = String.valueOf(ss);
        }
        return f;
    }
}
/**************************************************************
 Problem: 1137
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2270 ms
 Memory:55000 kb
 ****************************************************************/




