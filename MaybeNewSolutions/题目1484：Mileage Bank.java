
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	/*
	 * 1484
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String currLine = scanner.nextLine();
			if (currLine.equals("#")) {
				break;
			}
			int resMiles = 0;
			while (!currLine.equals("0")) {
				String array[] = currLine.split(Pattern.quote(" "));
				int actMiles = Integer.parseInt(array[2]);
				String claCode = array[3];
				if (claCode.equals("F")) {
					resMiles += actMiles * 2;
				} else if (claCode.equals("B")){
					resMiles += actMiles + (actMiles%2 == 0 ? actMiles/2 : actMiles/2 + 1);
				} else if (claCode.equals("Y")){
					resMiles += (actMiles >= 1 && actMiles <= 500) ? 500 : actMiles; 
				}
				currLine = scanner.nextLine();
			}
			System.out.println(resMiles);
		}
	}
}
	
/**************************************************************
	Problem: 1484
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:230 ms
	Memory:27560 kb
****************************************************************/


                        