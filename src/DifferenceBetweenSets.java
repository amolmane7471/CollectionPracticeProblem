import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferenceBetweenSets {

	public static void main(String[] args) {

		Set<String> topics1 = new HashSet<>();
		topics1.add("Python");
		topics1.add("Java");
		topics1.add("Cryptography");
		topics1.add("Networking");

		System.out.println("Topics Are in HashSet1 : ");
		
		for(String tempTopics : topics1) {
			System.out.println(tempTopics);
		}
		
		Set<String> topics2 = new HashSet<>();
		topics2.add("Cryptography");
		topics2.add("Java");
		
		System.out.println("\n Topics Are in HashSet2 : ");
		
		Iterator<String> itr = topics2.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		topics1.removeAll(topics2);
	
		System.out.println("\n difference between two sets are : "+topics1);
		
	}

}
