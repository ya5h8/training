import java.util.*;
class Frequency{
	public static void main(String[] args) {
		String s = "Hello Everyone";
		String s1 = s.toLowerCase();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char ch : s1.toCharArray()){
			if(!map.containsKey(ch)){
				map.put(ch , 1);
			}else{
				map.put(ch , map.get(ch)+1);
			}
		}
		System.out.println(map);
	}
}