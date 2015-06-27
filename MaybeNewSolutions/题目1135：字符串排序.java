
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
	/*
	 * 1135
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = Integer.parseInt(scanner.nextLine());
			List<String> arrayList = new ArrayList<String>();
			for (int i = 0; i < num; i++) {
				String a = scanner.nextLine();
				if (a.equals("stop")) {
					break;
				}
				arrayList.add(a);
			}
			int size = arrayList.size();
			String array[]= new String[size];
			for (int i = 0; i < size; i++) {
				array[i] = arrayList.get(i);
			}
			Arrays.sort(array,new newString());
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
    }
     	 
}
class newString implements Comparator<String>{

	/**
	 * @date 2013-8-10,下午07:29:39
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(String o1, String o2) {
		
		return o1.length() - o2.length();
	}
	
}
/**************************************************************
	Problem: 1135
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:90 ms
	Memory:15728 kb
****************************************************************/


                        