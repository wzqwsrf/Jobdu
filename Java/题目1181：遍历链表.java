
// 题目1181：遍历链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1181
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17284829
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1181
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            LinkedNode node = null;
            LinkedNode point = null;
            st.nextToken();
            node = new LinkedNode((int) st.nval, null);
            point = node;
            for (int i = 1; i < n; i++) {
                st.nextToken();
                LinkedNode tempNode = new LinkedNode((int) st.nval, null);
                point.next = tempNode;
                point = point.next;
            }

            point = node;
            LinkedNode qNode = null;
            while (point != null) {
                qNode = point.next;
                while (qNode != null) {
                    if (point.data > qNode.data) {
                        int data = point.data;
                        point.data = qNode.data;
                        qNode.data = data;
                    }
                    qNode = qNode.next;
                }
                point = point.next;
            }

            StringBuffer sb = new StringBuffer();
            while (node != null) {
                sb.append(node.data + " ");
                node = node.next;
            }
            System.out.println(sb.toString().trim());
        }
    }

    static class LinkedNode {
        private int data;

        private LinkedNode next;

        public LinkedNode(int data, LinkedNode next) {
            super();
            this.data = data;
            this.next = next;
        }

        public LinkedNode() {
            super();
        }
    }
}
/**************************************************************
 Problem: 1181
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:540 ms
 Memory:59352 kb
 ****************************************************************/




