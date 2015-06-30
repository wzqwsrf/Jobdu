
// 题目1490：字符串链接

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1490
 */

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
            String a = scanner.next();
            String b = scanner.next();
            char[] arrayA = a.toCharArray();
            char[] arrayB = b.toCharArray();
            char newChar[] = MyStrcat(arrayA, arrayB);
            for (int i = 0; i < newChar.length; i++) {
                System.out.print(newChar[i]);
            }
            System.out.println();
        }
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-10,下午08:10:53
     * @author wangzq
     * @version 3.0.0
     *
     * @param arrayA
     * @param arrayB
     * @return
     */
    private static char[] MyStrcat(char[] dstStr, char[] charsrcStr) {
        int desLength = dstStr.length;
        int charLength = charsrcStr.length;
        char newChar[] = new char[desLength + charLength];
        for (int i = 0; i < desLength; i++) {
            newChar[i] = dstStr[i];
        }
        for (int i = desLength; i < newChar.length; i++) {
            newChar[i] = charsrcStr[i - desLength];
        }
        return newChar;
    }

}
/**************************************************************
 Problem: 1490
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15640 kb
 ****************************************************************/




