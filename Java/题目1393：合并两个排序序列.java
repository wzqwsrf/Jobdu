
// 题目1393：合并两个排序序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1393
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17229857
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
     * 1371
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int size = (int) st.nval;
            int length = size * 2;
            int arrayA[] = new int[size];
            int arrayB[] = new int[size];
            for (int i = 0; i < size; i++) {
                st.nextToken();
                arrayA[i] = (int) st.nval;
            }
            for (int i = 0; i < size; i++) {
                st.nextToken();
                arrayB[i] = (int) st.nval;
            }
            int array[] = new int[length];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < size && j < size) {
                if (arrayA[i] < arrayB[j]) {
                    array[k++] = arrayA[i++];
                } else {
                    array[k++] = arrayB[j++];
                }
            }

            if (i == size) {
                while (j < size) {
                    array[k++] = arrayB[j++];
                }
            } else {
                while (i < size) {
                    array[k++] = arrayA[i++];
                }
            }

            StringBuffer sb = new StringBuffer();
            for (i = 0; i < length - 1; i++) {
                sb.append(array[i]);
                sb.append(" ");
            }
            sb.append(array[length - 1]);
            System.out.println(sb.toString());

        }
    }

}
/**************************************************************
 Problem: 1393
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2060 ms
 Memory:111380 kb
 ****************************************************************/




