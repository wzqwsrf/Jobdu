
// 题目1044：Pre-Post

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1044
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/21638269
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1044
     */
    private static long num = 1;

    private static long numArr[];

    public static void main(String[] args) throws Exception {
        initArr();
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            String preOrder = st.sval;
            st.nextToken();
            String postOrder = st.sval;
            num = 1;
            CaculateTree(n, preOrder, postOrder);
            System.out.println(num);
        }
    }

    private static void CaculateTree(int n, String preOrder, String postOrder) {
        int len = preOrder.length();
        if (len == 1) {
            return;
        }
        int count = 0;
        preOrder = preOrder.substring(1);
        postOrder = postOrder.substring(0, len - 1);
        while (!"".equals(preOrder)) {
            int index = postOrder.indexOf(preOrder.charAt(0)) + 1;
            String newPre = preOrder.substring(0, index);
            String newPost = postOrder.substring(0, index);
            preOrder = preOrder.substring(index);
            postOrder = postOrder.substring(index);
            count++;
            CaculateTree(n, newPre, newPost);
        }
        num *= CaculateCom(count, n);
    }

    private static void initArr() {
        numArr = new long[21];
        numArr[0] = 1;
        for (int i = 1; i < 21; i++) {
            numArr[i] = numArr[i - 1] * i;
        }
    }

    private static long CaculateCom(int subNum, int n) {
        return numArr[n] / (numArr[n - subNum] * numArr[subNum]);
    }
}
/**************************************************************
 Problem: 1044
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14584 kb
 ****************************************************************/




