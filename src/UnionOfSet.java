import java.util.HashSet;
import java.util.Iterator;

public class UnionOfSet {

	public static void main(String[] args) {
		HashSet<Integer> evenNum = new HashSet<>();
		evenNum.add(2);
		evenNum.add(2);//duplicatation not allowed
		evenNum.add(4);	
		evenNum.add(6);
		evenNum.add(8);
		
		//System.out.println(evenNum);
		
		System.out.println("\n Even Numbers Are : ");
		
		for(Integer set : evenNum){
		System.out.println(set);
		}
		
		HashSet<Integer> oddNum = new HashSet<>();
	    oddNum.add(3);
		oddNum.add(5);
		oddNum.add(7);
		
		System.out.println("\n Odd Numbers  Are :");
		Iterator<Integer> itr = oddNum.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

		oddNum.addAll(evenNum);	
			System.out.println("\n Union Of Two Sets  : "+oddNum);
	
	}

}
