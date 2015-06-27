
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * 1120
     */
	private static List<String> arrList;

	public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			arrList = new ArrayList<String>();
			String a = st.sval;
			permutation(a.toCharArray(), 0);
			Collections.sort(arrList);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arrList.size(); i++) {
				sb.append(arrList.get(i) + "\n");
			}
			System.out.println(sb);
		}
	}

	public static void permutation(char[] str, int index) {
		int len = str.length;
		if (index >= len)
			return;
		if (index == len - 1) {
			arrList.add(String.valueOf(str));
		} else {
			for (int j = index; j < len; j++) {

				char temp = str[j];
				str[j] = str[index];
				str[index] = temp;

				permutation(str, index + 1);

				temp = str[j];
				str[j] = str[index];
				str[index] = temp;
			}
		}
	}
}
/**************************************************************
	Problem: 1120
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1920 ms
	Memory:156448 kb
****************************************************************/


                        