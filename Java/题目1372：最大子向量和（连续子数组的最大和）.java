
// 题目1372：最大子向量和（连续子数组的最大和）

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1372
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1372
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }

            int sum = array[0];
            int tempSum = 0;
            int end = 0;
            for (int i = 0; i < n; i++) {
                if (tempSum < 0) {
                    tempSum = array[i];
                } else if (tempSum >= 0) {
                    tempSum += array[i];
                }
                if (tempSum > sum) {
                    sum = tempSum;
                    end = i;
                }
            }
            int finalSum = 0;
            int start = 0;
            for (int i = end; i >= 0; i--) {
                finalSum += array[i];
                if (finalSum == sum) {
                    start = i;
                }
            }
            System.out.println(sum + " " + start + " " + end);
        }
    }
}

/**************************************************************
 Problem: 1372
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1530 ms
 Memory:34008 kb
 ****************************************************************/




