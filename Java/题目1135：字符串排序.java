
// 题目1135：字符串排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1135
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17224333
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangzq
 * @version 3.0.0
 * @ClassName: Main1046
 * @Description: TODO
 * @date 2013-8-7 下午04:00:39
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
            String array[] = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = arrayList.get(i);
            }
            Arrays.sort(array, new newString());
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

}

class newString implements Comparator<String> {

    /**
     * @date 2013-8-10,下午07:29:39
     * @author wangzq
     * @version 3.0.0
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(String o1, String o2) {

        return o1.length() - o2.length();
    }

}
/**************************************************************
 * Problem: 1135
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15728 kb
 ****************************************************************/


                        


