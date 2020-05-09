package mx.tec.lab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public int add(String numbers) {
		
		Pattern p = Pattern.compile("//(.)\n");
		Matcher m = p.matcher(numbers);
		String separator = ",";
		String prefix = "";
		
		if(m.find()) {
			prefix = m.group(0);
			separator = m.group(1);
		}

		String arr[] = numbers.substring(prefix.length()).split(separator + "|\n");
				

		if (arr.length == 1 && arr[0].isEmpty()) {
			return 0;
		}
		if (arr.length == 1) {
			return Integer.parseInt(arr[0]);
		}
		int result = 0;

		for (String number : arr) {

			result += Integer.parseInt(number);

		}
		return result;
	}
}
