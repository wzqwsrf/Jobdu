
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
	 * 1517
	 */
	public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int k = (int) st.nval;
			LinkedNode node = null;
			LinkedNode point = null;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				LinkedNode tempNode = new LinkedNode((int) st.nval ,null);
				if (point == null) {
					node = tempNode;
					point = tempNode;
				}else {
					point.setNext(tempNode);
					point = point.getNext();
				}
			}
			int i = 0;
			while (node != null && i != n - k) {
				node = node.next;
				i++;
			}
			if (node == null) {
				System.out.println("NULL");
			}else {
				System.out.println(node.getData());
			}
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
	Problem: 1517
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1120 ms
	Memory:28588 kb
****************************************************************/


                        