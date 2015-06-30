
// 题目1415：不一样的循环队列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1415
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17266757
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1415
     */
    private static QueueLoop queue;

    private static int len;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            queue = new QueueLoop(m);
            len = m + 1;
            while (n > 0) {
                n--;
                st.nextToken();
                String operate = st.sval;
                if (operate.equals("Push")) {
                    st.nextToken();
                    int k = (int) st.nval;
                    if (!pushElement(k)) {
                        System.out.println("failed");
                    }
                } else if (operate.equals("Pop")) {
                    if (!popElement()) {
                        System.out.println("failed");
                    }
                } else if (operate.equals("Query")) {
                    st.nextToken();
                    int k = (int) st.nval;
                    Integer value = queryElement(k);
                    if (value == null) {
                        System.out.println("failed");
                    } else {
                        System.out.println(value);
                    }
                } else if (operate.equals("Isempty")) {
                    System.out.println(IsEmpty() == true ? "yes" : "no");
                } else {
                    System.out.println(Isfull() == true ? "yes" : "no");
                }
            }
        }
    }

    private static boolean pushElement(int k) {
        if (Isfull()) {
            return false;
        }
        int rear = queue.rear;
        int array[] = queue.array;
        array[rear] = k;
        queue.array = array;
        queue.rear = (rear + 1) % len;
        return true;
    }

    private static boolean popElement() {
        if (IsEmpty()) {
            return false;
        }
        int front = queue.front;

        queue.front = (front + 1) % len;
        return true;
    }

    private static Integer queryElement(int k) {
        int front = queue.front;
        int rear = queue.rear;
        int array[] = queue.array;
        if (k <= 0 || rear - front < k) {
            return null;
        }
        return array[k + front - 1];
    }

    private static boolean IsEmpty() {
        int front = queue.front;
        int rear = queue.rear;
        if (rear == front) {
            return true;
        }
        return false;

    }

    private static boolean Isfull() {
        int front = queue.front;
        int rear = queue.rear;
        if ((rear + 1) % len == front) {
            return true;
        }
        return false;

    }

    public static class QueueLoop {
        int array[];

        int front;

        int rear;

        public QueueLoop(int[] array, int front, int rear) {
            super();
            this.array = array;
            this.front = front;
            this.rear = rear;
        }

        public QueueLoop(int size) {
            array = new int[size + 1];
            front = 0;
            rear = 0;
        }

        public QueueLoop() {
            super();
        }
    }
}

/**************************************************************
 Problem: 1415
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2280 ms
 Memory:43496 kb
 ****************************************************************/




