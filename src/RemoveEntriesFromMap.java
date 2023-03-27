import java.util.HashMap;
import java.util.Iterator;


public class RemoveEntriesFromMap {

	public static void main(String[] args) {
		HashMap<String,Integer> rollNum = new HashMap<>();
		rollNum.put("Rahul", 100);
		rollNum.put("Sachin", 102);
		rollNum.put("Akash", 103);
		rollNum.put("Aman", 104);
		rollNum.put("Virat", 105);
		
		System.out.println(" map list before deleting entries  : "+rollNum);
		
		 Iterator < String > itr = rollNum.keySet().iterator();
			      
			 while (itr.hasNext()) {
			           
	            String key = itr.next();
		
	              if (rollNum.get(key) % 5 == 0) {
			             
			                itr.remove();
			            }
	              	
			        }
			        
			        System.out.println("\n map list after deleting entries : "+rollNum);
			        
	}

}
