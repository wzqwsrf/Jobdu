
// 题目1517：链表中倒数第k个结点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1517
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/20696459
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1517
     */
    private static int n, k;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            n = (int) st.nval;
            st.nextToken();
            k = (int) st.nval;
            LinkedNode node = new LinkedNode();
            LinkedNode point = node;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int data = (int) st.nval;
                LinkedNode tmpNode = new LinkedNode(data, null);
                point.next = tmpNode;
                point = tmpNode;
            }
            getLastK(node);
        }
    }

    private static void getLastK(LinkedNode node) {
        int num = 0;
        int findNum = n - k + 1;
        if (findNum < 1) {
            System.out.println("NULL");
            return;
        }
        while (node.next != null) {
            num++;
            node = node.next;
            if (num == findNum) {
                System.out.println(node.data);
            }
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
 Problem: 1517
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:1170 ms
 Memory:28780 kb
 ****************************************************************/




