import java.util.HashMap;
import java.util.Map;

public class MergeMap {

	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<>();
		map1.put("Apple", 10);
		map1.put("Grapes", 20);
		map1.put("Orange", 5);
		map1.put("Banana", 15);
		
		System.out.println("Elements are in map1 : "+map1);
		
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("Apple", 8);
		map2.put("Grapes", 12);
		map2.put("PineApple", 10);
		
		System.out.println("\n Elements are in map2 : "+map2);
		
		map1.putAll(map2);
		System.out.println("\n Elements are in map1 : "+map1);
		
		//iterating using enhanced forloop
		for(Map.Entry m: map1.entrySet()) {
			System.out.println("\n key :"+m.getKey()+ " Value :"+m.getValue());
		}
	}

}
