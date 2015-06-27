
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	/*
     * 1511
     */
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	List<Integer> arrList = new ArrayList<Integer>();
        while (scanner.hasNext()) {
        	int n = scanner.nextInt();
        	if (n == -1) {
				break;
			}
        	arrList.add(n);
        }
        StringBuffer sb = new StringBuffer();
    	for (int i = arrList.size()-1; i >= 0 ; i--) {
    		sb.append(arrList.get(i)+"\n");
		}
    	System.out.println(sb.toString().trim());
    }
}

/**************************************************************
	Problem: 1511
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2020 ms
	Memory:109032 kb
****************************************************************/


                        