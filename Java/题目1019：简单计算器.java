
// 题目1019：简单计算器

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1019
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1019
     */
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			Stack<Double> stack1 = new Stack<Double>();
			Stack<String> stack2 = new Stack<String>();
			String a = scanner.nextLine();
			if (a.equals("0")) {
				break;
			}
			stack2.push("#");
			String array[] = a.split(Pattern.quote(" "));
			int i = 0;
			while (i < array.length) {
//				&&!array[i].equals("*")&&!array[i].equals("/")
				if (array[i].equals("+")||array[i].equals("-")) {
					stack2.push(array[i]);
//					stack1.push(Double.parseDouble(array[i+1]));
				}else if (array[i].equals("*")||array[i].equals("/")){
					double num1 = stack1.pop();
					double num2 = Double.parseDouble(array[i+1]);
					double result = 0;
					if (array[i].equals("/")) {
						result = num1/num2;
					}else {
						result = num1*num2;
					}
					stack1.push(result); 
					i++;
				}else {
					stack1.push(Double.parseDouble(array[i]));
				}
				i++;
			}
			
			double array1[] = new double[stack1.size()];
			String array2[] = new String[stack2.size()-1];
			int k = array1.length-1;
			while (!stack1.isEmpty()&& k >= 0) {
				array1[k] = stack1.pop();
				k --;
			}
			k = array2.length-1;
			while (!stack2.isEmpty()&& k >= 0) {
				array2[k] = stack2.pop();
				k--;
			}
			k = 0;
			double res = array1[0];
			while (k < array2.length) {
				if (array2[k].equals("+")) {
					res += array1[k+1];
				}else if (array2[k].equals("-")) {
					res += -array1[k+1];
				}
				k++;
			}
			System.out.printf("%.2f\n" ,res);
		}
	}}

/**************************************************************
 Problem: 1019
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15664 kb
 ****************************************************************/




