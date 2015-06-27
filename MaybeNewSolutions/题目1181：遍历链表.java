
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	/*
	 * 1181
	 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        while (scanner.hasNext()) {
	        	int n = scanner.nextInt();
	        	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	        	for (int i = 0; i < n; i++) {
	        		linkedList.add(scanner.nextInt());
				}
	        	Collections.sort(linkedList);
	        	StringBuffer sb = new StringBuffer();
	        	for (Iterator iterator = linkedList.iterator(); iterator
						.hasNext();) {
					sb.append(iterator.next()+" ");
					
				}
	        	System.out.println(sb.toString().trim());
	        }
	}
}

/**************************************************************
	Problem: 1181
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1510 ms
	Memory:120596 kb
****************************************************************/


                        