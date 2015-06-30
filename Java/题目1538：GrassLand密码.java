
// 题目1538：GrassLand密码

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1538
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
     * 1050
     */
    private static Map<Character, Integer> letterMap;

    public static void main(String[] args) {
        initLetterMap();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String letter = scanner.next();
            int len = letter.length();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < len; i++) {
                sb.append(letterMap.get(letter.charAt(i)));
            }
            System.out.println(sb);
        }
    }

    private static void initLetterMap() {
        letterMap = new HashMap<Character, Integer>();
        letterMap.put('a', 2);
        letterMap.put('b', 2);
        letterMap.put('c', 2);
        letterMap.put('d', 3);
        letterMap.put('e', 3);
        letterMap.put('f', 3);
        letterMap.put('g', 4);
        letterMap.put('h', 4);
        letterMap.put('i', 4);
        letterMap.put('j', 5);
        letterMap.put('k', 5);
        letterMap.put('l', 5);
        letterMap.put('m', 6);
        letterMap.put('n', 6);
        letterMap.put('o', 6);
        letterMap.put('p', 7);
        letterMap.put('q', 7);
        letterMap.put('r', 7);
        letterMap.put('s', 7);
        letterMap.put('t', 8);
        letterMap.put('u', 8);
        letterMap.put('v', 8);
        letterMap.put('w', 9);
        letterMap.put('x', 9);
        letterMap.put('y', 9);
        letterMap.put('z', 9);

    }
}
/**************************************************************
 * Problem: 1538
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1410 ms
 * Memory:28548 kb
 ****************************************************************/


                        


