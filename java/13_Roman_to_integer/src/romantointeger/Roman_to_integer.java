package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_integer {

	public static void main(String[] args) {
		String[] s = {"","III", "IV", "IX", "MCMXCIV"};
		Roman_to_integer rti = new Roman_to_integer();
		for(int i = 0; i < s.length; i++) {
			System.out.println(rti.romanToInt(s[i]));
		}

	}
	public int romanToInt(String s) {
		int len = s.length();
		if( s == null || len == 0 ) return 0;
		Map<Character, Integer> maps = new HashMap<>();
		maps.put('I', 1);
		maps.put('V', 5);
		maps.put('X', 10);
		maps.put('L', 50);
		maps.put('C', 100);
		maps.put('D', 500);
		maps.put('M', 1000);
		int result = maps.get(s.charAt(len - 1));
		for(int i = len - 2; i >= 0; i--) {
			if(maps.get(s.charAt(i)) >= maps.get(s.charAt(i+1))){
				result += maps.get(s.charAt(i));
			}else {
				result -= maps.get(s.charAt(i));
			}
		}
		return result;

    }
}
