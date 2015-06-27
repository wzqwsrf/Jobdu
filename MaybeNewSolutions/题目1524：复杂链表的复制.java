
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
            int array[] = new int[n+1];
            LinkedNode node = null;  
            LinkedNode point = null;  
            for (int i = 0; i < n; i++) {
            	st.nextToken();  
            	array[i+1] = (int)st.nval;
        		LinkedNode tempNode = new LinkedNode(array[i+1] , null , null);  
            	if (point == null) {
            		node = tempNode;
            		point = node;
				}else {
					point.next = tempNode;  
	                point = point.next; 
				}
            }
            point = node;
            for (int i = 0; i < n; i++) {
            	st.nextToken();  
            	point.special = new LinkedNode(array[(int)st.nval] , null , null);
            	point = point.next;
            }
            
            for (int i = 0; i < n; i++) {
            	System.out.println(node.data+" "+node.special.data);
            	node = node.next;
            }
        }  
	}
    static class LinkedNode{
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
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:840 ms
	Memory:26948 kb
****************************************************************/


                        