import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEqualOrNot {

	public static void main(String[] args) {
		Set<Integer> num1 = new TreeSet<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		
		System.out.println("Elements in TreeSets1 Are : ");
		Iterator<Integer> itr = num1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 
		Set<Integer> num2 = new TreeSet<>();
		num2.add(10);
		num2.add(20);
		num2.add(30);
		num2.add(40);

		System.out.println("\n Elements in TreeSets2 Are : ");
		for(Integer temp : num2) {
			System.out.println(temp);
		}
		
		Boolean result = num1.equals(num2);
		System.out.println(result);
			
		if(result == true) {
			System.out.println("\n Both Sets Are Equal");
		}
		
		else {
			System.out.println("\n Both Sets Are Not Equal");
		}
	}

}
