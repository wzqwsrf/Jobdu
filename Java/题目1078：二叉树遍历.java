
// 题目1078：二叉树遍历

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1078
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1380
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String prePost = st.sval;
            st.nextToken();
            String inpost = st.sval;
            System.out.println(printLast(prePost, inpost));
        }
    }

    static String printLast(String prePost, String inpost) {
        if (prePost.length() <= 1) { //出口
            return prePost;
        }
        char ch = prePost.charAt(0);
        int index = inpost.indexOf(ch);
        return printLast(prePost.substring(1, index + 1), inpost.substring(0,
                index))
                + printLast(prePost.substring(index + 1), inpost
                        .substring(index + 1)) + ch;
    }
}

/**************************************************************
 Problem: 1078
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14540 kb
 ****************************************************************/




