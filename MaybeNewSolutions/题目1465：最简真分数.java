
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main{
	/*
     * 1465 排序 遍历
     */
    public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			if (n == 0) {
				break;
			}
			int array[] = new int[n];
            for (int i = 0; i < n; i++) {
            	st.nextToken();
            	array[i] = (int) st.nval;
            }
            Arrays.sort(array);
            int num = 0;
            for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (array[i] == 1 && array[j] == 1) {
						continue;
					}else if (array[i] == 1 && array[j] != 1){
						num++;
						continue;
					}
					if (array[j] % array[i] != 0 ) {
						boolean flag = true;
						for (int k = 2; k < array[i] ; k++) {
							if (array[j] % k == 0 && array[i] % k == 0) {
								flag = false;
								break;
							}
						}
						if (flag) {
							num++;
						}
					}
				}
			}
            System.out.println(num);
        }
    }
	
}
/**************************************************************
	Problem: 1465
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1580 ms
	Memory:25516 kb
****************************************************************/


                        