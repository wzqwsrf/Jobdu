
// 题目1524：复杂链表的复制

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1524
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17308987
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1524
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n + 1];
            LinkedNode node = null;
            LinkedNode point = null;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i + 1] = (int) st.nval;
                LinkedNode tempNode = new LinkedNode(array[i + 1], null, null);
                if (point == null) {
                    node = tempNode;
                    point = node;
                } else {
                    point.next = tempNode;
                    point = point.next;
                }
            }
            point = node;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                point.special = new LinkedNode(array[(int) st.nval], null, null);
                point = point.next;
            }

            for (int i = 0; i < n; i++) {
                System.out.println(node.data + " " + node.special.data);
                node = node.next;
            }
        }
    }

    static class LinkedNode {
        private int data;

        private LinkedNode next;

        private LinkedNode special;

        public LinkedNode(int data, LinkedNode next, LinkedNode special) {
            super();
            this.data = data;
            this.next = next;
            this.special = special;
        }

        public LinkedNode() {
            super();
        }
    }
}
/**************************************************************
 Problem: 1524
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:860 ms
 Memory:27564 kb
 ****************************************************************/




