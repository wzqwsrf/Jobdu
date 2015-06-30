
// 题目1440：Goldbach's Conjecture

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1440
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
     * 1440
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            List<Integer> arrList = new ArrayList<Integer>();
            arrList = getPrimeArray(arrList);
            int count = 0;
            int i = 0;
            int num = 0;
            while (true) {
                num = arrList.get(i);
                if (num > n / 2) {
                    break;
                }
                int secNum = n - num;
                if (arrList.contains(secNum)) {
//					System.out.println(num+"   "+secNum);
                    count++;
                }
                i++;
            }
            System.out.println(count);
        }
    }


    private static List<Integer> getPrimeArray(List<Integer> arrList) {
        int length = 40000;
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        array[0] = 0;
        array[1] = 0;
        array[2] = 1;
        for (int i = 2; i * i < length; i++) {
            if (array[i] != 0) {
                for (int j = 2 * i; j < length; j += i) {
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                arrList.add(i);
            }
        }
        return arrList;
    }
}

/**************************************************************
 * Problem: 1440
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:320 ms
 * Memory:28000 kb
 ****************************************************************/


                        


