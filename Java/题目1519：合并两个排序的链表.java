
// 题目1519：合并两个排序的链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1519
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1209
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            if (n == 0 && m == 0) {
                System.out.println("NULL");
                continue;
            }
            LinkedNode nodeA = null;
            LinkedNode pointA = null;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                LinkedNode tempNode = new LinkedNode((int) st.nval, null);
                if (pointA == null) {
                    nodeA = tempNode;
                    pointA = tempNode;
                } else {
                    pointA.setNext(tempNode);
                    pointA = pointA.getNext();
                }
            }
            LinkedNode nodeB = null;
            LinkedNode pointB = null;
            for (int i = 0; i < m; i++) {
                st.nextToken();
                LinkedNode tempNode = new LinkedNode((int) st.nval, null);
                if (pointB == null) {
                    nodeB = tempNode;
                    pointB = tempNode;
                } else {
                    pointB.setNext(tempNode);
                    pointB = pointB.getNext();
                }
            }
            LinkedNode node = mergeLinkedList(nodeA, nodeB);
            printLindNode(node);
        }
    }

    static LinkedNode mergeLinkedList(LinkedNode nodeA, LinkedNode nodeB) {

        if (nodeA == null && nodeB != null) {
            return nodeB;
        }

        if (nodeA != null && nodeB == null) {
            return nodeA;
        }

        LinkedNode head = null;
        LinkedNode current = null;

        while (nodeA != null && nodeB != null) {

            int num1 = nodeA.getData();
            int num2 = nodeB.getData();
            if (num1 >= num2) {
                if (current == null) {
                    head = nodeB;
                    current = nodeB;
                } else {
                    current.setNext(nodeB);
                    current = current.getNext();
                }
                nodeB = nodeB.getNext();
            } else {
                if (current == null) {
                    head = nodeA;
                    current = nodeA;
                } else {
                    current.setNext(nodeA);
                    current = current.getNext();
                }
                nodeA = nodeA.getNext();
            }
        }
        if (nodeA == null && nodeB != null) {
            current.setNext(nodeB);
        }
        if (nodeA != null && nodeB == null) {
            current.setNext(nodeA);
        }
        return head;

    }

    static class LinkedNode {
        private int data;

        private LinkedNode next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public LinkedNode getNext() {
            return next;
        }

        public void setNext(LinkedNode next) {
            this.next = next;
        }

        public LinkedNode(int data, LinkedNode next) {
            super();
            this.data = data;
            this.next = next;
        }

        public LinkedNode() {
            super();
        }
    }

    static void printLindNode(LinkedNode node) {
        if (node == null) {
            System.out.println("NULL");
        } else {
            StringBuffer sb = new StringBuffer();
            while (node != null) {
                sb.append(node.getData() + " ");
                node = node.next;
            }
            System.out.println(sb.toString().trim());
        }
    }
}
/**************************************************************
 Problem: 1519
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1510 ms
 Memory:50156 kb
 ****************************************************************/




