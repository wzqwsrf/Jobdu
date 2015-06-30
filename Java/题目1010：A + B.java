
// 题目1010：A + B

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1010
 */

import java.util.Scanner;
import java.util.regex.Pattern;

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
     * 1010
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ab = scanner.nextLine();
            ab = ab.replace("=", "").trim();
            String array[] = ab.split(Pattern.quote("+"));
            if (array.length == 2 && array[0].trim().equalsIgnoreCase("zero")
                    && array[1].trim().equalsIgnoreCase("zero")) {
                break;
            }
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                String newArray[] = array[i].split(Pattern.quote(" "));
                String numStr = "";
                for (int j = 0; j < newArray.length; j++) {
                    String b = replaceLetter(newArray[j].trim());
                    numStr += b;
                }
                result += Integer.parseInt(numStr);
            }

            System.out.println(result);
        }
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-10,下午09:24:18
     * @author wangzq
     * @version 3.0.0
     *
     * @param string
     * @return
     */
    private static String replaceLetter(String letter) {

        if (letter.equalsIgnoreCase("one")) {
            return "1";
        } else if (letter.equalsIgnoreCase("two")) {
            return "2";
        } else if (letter.equalsIgnoreCase("three")) {
            return "3";
        } else if (letter.equalsIgnoreCase("four")) {
            return "4";
        } else if (letter.equalsIgnoreCase("five")) {
            return "5";
        } else if (letter.equalsIgnoreCase("six")) {
            return "6";
        } else if (letter.equalsIgnoreCase("seven")) {
            return "7";
        } else if (letter.equalsIgnoreCase("eight")) {
            return "8";
        } else if (letter.equalsIgnoreCase("nine")) {
            return "9";
        } else if (letter.equalsIgnoreCase("zero")) {
            return "0";
        }
        return "0";
    }
}
/**************************************************************
 Problem: 1010
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:90 ms
 Memory:15612 kb
 ****************************************************************/




