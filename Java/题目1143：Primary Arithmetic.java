
// 题目1143：Primary Arithmetic

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1143
 */

import java.io.StreamTokenizer;

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
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int anum = (int) st.nval;
            st.nextToken();
            int bnum = (int) st.nval;
            if (anum == 0 && bnum == 0) {
                break;
            }
            String a = anum + "";
            String b = bnum + "";
            int aLength = a.length();
            int bLength = b.length();
            int max = Math.max(aLength, bLength);
            int[] arrayA = new int[max + 1];
            int[] arrayB = new int[max + 1];
            int k = 0;
            for (int i = max + 1 - aLength; i < max + 1; i++) {
                arrayA[i] = a.charAt(k) - '0';
                k++;
            }
            k = 0;
            for (int i = max + 1 - bLength; i < max + 1; i++) {
                arrayB[i] = b.charAt(k) - '0';
                k++;
            }
            int num = 0;
            int[] arrayC = new int[max + 1];
            for (int i = max; i > 0; i--) {
                arrayC[i] += arrayA[i] + arrayB[i];
                if (arrayC[i] >= 10) {
                    arrayC[i] -= 10;
                    arrayC[i - 1] += 1;
                    num++;
                }
            }
            if (num == 0) {
                System.out.println("NO carry operation.");
            } else {
                if (num == 1) {
                    System.out.println(num + " carry operation.");
                } else {
                    System.out.println(num + " carry operations.");
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1143
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14544 kb
 ****************************************************************/




