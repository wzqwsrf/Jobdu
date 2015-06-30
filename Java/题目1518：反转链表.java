
// 题目1518：反转链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1518
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1518
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                System.out.println("NULL");
                continue;
            }
            LinkedNode node = null;
            LinkedNode point = null;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                LinkedNode tempNode = new LinkedNode((int) st.nval, null);
                if (point == null) {
                    node = tempNode;
                    point = node;
                } else {
                    point.next = tempNode;
                    point = point.next;
                }
            }

            LinkedNode end = null;
            LinkedNode q;
            point = node;
            while (point != null) {
                q = point.next;
                point.next = end;
                end = point;
                point = q;
            }
            StringBuffer sb = new StringBuffer();
            while (end != null) {
                sb.append(end.data + " ");
                end = end.next;
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
 Problem: 1518
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1620 ms
 Memory:36964 kb
 ****************************************************************/




