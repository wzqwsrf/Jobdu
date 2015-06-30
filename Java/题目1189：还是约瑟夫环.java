
// 题目1189：还是约瑟夫环

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1189
 */

public class Main {
    /*
     * 1189
     */
    public static void main(String[] args) throws Exception {

        LinkedNode node = new LinkedNode(1, null);
        LinkedNode point = node;
        for (int i = 2; i < 22; i++) {
            LinkedNode tempNode = new LinkedNode(i, null);
            point.setNext(tempNode);
            point = point.getNext();
        }
        point.setNext(node);
        point = node;
        LinkedNode qNode;
        int count = 0;
        int size = 0;
        while (point != null && size <= 20) {
            point = point.getNext();
            count++;
            if (count == 15) {
                qNode = point.getNext().getNext();
                point.setNext(qNode);
                count = 0;
                point = point.getNext();
                size++;
            }
        }
        System.out.println(point.getData());
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
 Problem: 1189
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:60 ms
 Memory:14520 kb
 ****************************************************************/




