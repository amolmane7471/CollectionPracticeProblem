import java.util.HashMap;
import java.util.Map;

public class SortMap {

	public static void main(String[] args) {
		HashMap<String,Integer> value = new HashMap<>();
		
		value.put("One",10);
		value.put("Two", 5);
		value.put("Three", 8);
		value.put("Four", 4);
		
		System.out.println("map before sorting : "+value);
				
		System.out.println("\nmap after sorting : ");

		 value.entrySet().stream().sorted(Map.Entry.comparingByValue())  
	      .forEach(System.out::println); 
	}

}
