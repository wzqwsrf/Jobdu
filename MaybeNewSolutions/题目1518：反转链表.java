
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1518
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
				System.out.println("NULL");
				continue;
			}
            st.nextToken();
            LinkedNode node = new LinkedNode((int) st.nval ,null);
            LinkedNode point = node;
            for (int i = 1; i < n; i++) {
            	st.nextToken();
            	LinkedNode tempNode = new LinkedNode((int) st.nval ,null);
            	point.setNext(tempNode);
            	point = point.getNext();
            }
            
            LinkedNode end = null;
            LinkedNode q ;
            point = node;
            while (point != null) {
            	q = point.getNext();
            	point.setNext(end);
            	end = point;
            	point = q;
			}
            node = end;
            
            
            StringBuffer sb = new StringBuffer();
            while (node != null) {
				sb.append(node.getData()+" ");
				node = node.getNext();
			}
            System.out.println(sb.toString().trim());
            
        }
    }
    static class LinkedNode{
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
}

/**************************************************************
	Problem: 1518
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1570 ms
	Memory:35868 kb
****************************************************************/


                        