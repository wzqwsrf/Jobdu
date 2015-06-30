
// 题目1505：两个链表的第一个公共结点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1505
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17285483
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1505 
     * ===我想多了，其实只要两个链表的某个节点相同就输出。并不是求共同后缀。。。
     * ===这个题目的意思应该是求交叉节点。
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            if (m == 0 && n == 0) {
                System.out.println("My God");
                continue;
            }
            LinkedNode nodeA = null;
            LinkedNode pointA = null;
            if (m > 0) {
                st.nextToken();
                nodeA = new LinkedNode((int) st.nval, null);
                pointA = nodeA;
                for (int i = 1; i < m; i++) {
                    st.nextToken();
                    LinkedNode tempNode = new LinkedNode((int) st.nval, null);
                    pointA.setNext(tempNode);
                    pointA = pointA.getNext();
                }
            }
            LinkedNode nodeB = null;
            LinkedNode pointB = null;
            if (n > 0) {
                st.nextToken();
                nodeB = new LinkedNode((int) st.nval, null);
                pointB = nodeB;
                for (int i = 1; i < n; i++) {
                    st.nextToken();
                    LinkedNode tempNode = new LinkedNode((int) st.nval, null);
                    pointB.setNext(tempNode);
                    pointB = pointB.getNext();
                }
            }

            pointA = nodeA;
            pointB = nodeB;
            int k = 0;
            Integer result = null;
            if (m > n) {
                while (k < m - n) {
                    pointA = pointA.getNext();
                    k++;
                }
            } else if (m < n) {
                k = 0;
                while (k < n - m) {
                    pointB = pointB.getNext();
                    k++;
                }
            }
            while (pointA != null && pointB != null) {
                int num1 = pointA.getData();
                int num2 = pointB.getData();
                if (num1 == num2) {
                    result = num1;
                    break;
                }
                pointA = pointA.getNext();
                pointB = pointB.getNext();
            }

            if (pointA != null) {
                result = pointA.getData();
            }
            if (result == null) {
                System.out.println("My God");
            } else {
                System.out.println(result);
            }
        }
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
    }

}
/**************************************************************
 Problem: 1505
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:940 ms
 Memory:27696 kb
 ****************************************************************/




