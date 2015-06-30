
// 题目1178：复数集合

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1178
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    /*
     * 1178
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine());
            List<String> arrList = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                String order = scanner.nextLine().trim();
                if (order.equals("Pop")) {
                    if (arrList.isEmpty()) {
                        System.out.println("empty");
                    } else {
                        Collections.sort(arrList, new sortString());
                        int size = arrList.size();
                        System.out.println(arrList.get(size - 1));
                        arrList.remove(size - 1);
                        System.out.println("SIZE = " + (size - 1));
                    }
                } else if (order.charAt(0) == 'I') {
                    String array[] = order.split(Pattern.quote(" "));
                    arrList.add(array[1]);
                    System.out.println("SIZE = " + arrList.size());
                }

            }
        }
    }

    static class sortString implements Comparator<String> {

        public int compare(String o1, String o2) {
            String arrayA[] = o1.replace("+i", " ").split(Pattern.quote(" "));
            String arrayB[] = o2.replace("+i", " ").split(Pattern.quote(" "));
            int a1 = Integer.parseInt(arrayA[0]);
            int b1 = Integer.parseInt(arrayA[1]);
            int a2 = Integer.parseInt(arrayB[0]);
            int b2 = Integer.parseInt(arrayB[1]);
            int result1 = a1 * a1 + b1 * b1;
            int result2 = a2 * a2 + b2 * b2;
            if (result1 != result2) {
                return result1 - result2;
            } else {
                return b2 - b1;
            }
        }
    }
}
/**************************************************************
 * Problem: 1178
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1320 ms
 * Memory:104512 kb
 ****************************************************************/


                        


