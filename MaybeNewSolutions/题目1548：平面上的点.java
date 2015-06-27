
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
	/*
	 * 1548
	 */
	public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(  
	            new InputStreamReader(System.in)));  
	    while (st.nextToken() != StreamTokenizer.TT_EOF) {  
	    	int n = (int)st.nval;
	    	if (n == 0) {
				System.out.println(n);
				continue;
			}
	    	Node nodes[] = new Node[n];
	    	for (int i = 0; i < n; i++) {
				st.nextToken();
				int x = (int)st.nval;
				st.nextToken();
				int y = (int)st.nval;
				nodes[i] = new Node(x, y);
			}
	    	if (n == 1 || n == 2) {
				System.out.println(n);
				continue;
			}
	    	int maxNum = 0;
	    	for (int i = 0; i < n; i++) {
	    		int x1 = nodes[i].x;
	    		int y1 = nodes[i].y;
				for (int j = i+1; j < n; j++) {
					int x2 = nodes[j].x;
		    		int y2 = nodes[j].y;
		    		int tempNum = 2;
		    		if (x2 == x1 && y2 == y1) {
						tempNum = 3;
						j++;
					}
		    		if (j >= n) {
		    			maxNum = Math.max(tempNum, maxNum);
		    			continue;
					}
		    		x2 = nodes[j].x;
		    		y2 = nodes[j].y;
					for (int k = j+1; k < n; k++) {
						int x3 = nodes[k].x;
			    		int y3 = nodes[k].y;
			    		int num1 = (y3 - y1)*(x2 - x1);
				    	int num2 = (y2 - y1)*(x3 - x1);
			    		if (num1 == num2) {
			    			tempNum++;
						}
					}
					maxNum = Math.max(tempNum, maxNum);
				}
			}
	    	System.out.println(maxNum);
	    }
	}
	public static class Node{
		int x;
		int y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
	
/**************************************************************
	Problem: 1548
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:430 ms
	Memory:16956 kb
****************************************************************/


                        