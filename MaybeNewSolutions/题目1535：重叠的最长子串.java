
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	 /*
     * 1535
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	String a = st.sval;
        	st.nextToken();
        	String b = st.sval;
        	int len1 = a.length();
        	int len2 = b.length();
        	int maxLen = 0;
        	int i = 0;
        	if (len1 >= len2) {
        		int start = len1 - len2;
        		i = start;
			}
        	for (; i < len1; i++) {
    			int tempLen = len1 - i;
				String tempA = a.substring(i);
				String tempB = b.substring(0 ,tempLen);
				if (tempA.equals(tempB)) {
					if (tempLen > maxLen) {
						maxLen = tempLen;
						break;
					}
				}
			}
        	System.out.println(maxLen);
        }
    }
}
/**************************************************************
	Problem: 1535
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2250 ms
	Memory:115228 kb
****************************************************************/


                        