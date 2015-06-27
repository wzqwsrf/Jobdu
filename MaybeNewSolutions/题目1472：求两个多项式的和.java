
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	/*
	 * 1472
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			Map<Integer, Integer> numMap = new HashMap<Integer, Integer>(); 
			int n1 = scanner.nextInt();
			for (int i = 0; i < n1; i++) {
				int ratioNum = scanner.nextInt();
				int indexNum = scanner.nextInt();
				int num = 0;
				if (numMap.get(indexNum) != null) {
					num = numMap.get(indexNum);
				}
				num += ratioNum;
				numMap.put(indexNum, num);
			}
			int n2 = scanner.nextInt();
			for (int i = 0; i < n2; i++) {
				int ratioNum = scanner.nextInt();
				int indexNum = scanner.nextInt();
				int num = 0;
				if (numMap.get(indexNum) != null) {
					num = numMap.get(indexNum);
				}
				num += ratioNum;
				numMap.put(indexNum, num);
			}
			Set<Integer> set = numMap.keySet();
			int size = set.size();
			int array[] = new int[size];
			int index = 0;
			for (Iterator iterator = set.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				array[index] = integer;
				index++;
			}
			Arrays.sort(array);
			StringBuffer sb = new StringBuffer();
			for (int i = size-1; i >= 0; i--) {
				int rationNum = numMap.get(array[i]);
				if (rationNum != 0) {
					sb.append(rationNum+" "+array[i]+" ");
				}
			}
			System.out.println(sb.toString().trim());
		}
		
	}
}
/**************************************************************
	Problem: 1472
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:400 ms
	Memory:29052 kb
****************************************************************/


                        