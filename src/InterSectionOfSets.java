import java.util.Iterator;
import java.util.LinkedHashSet;

public class InterSectionOfSets {

	public static void main(String[] args) {

		LinkedHashSet<String> city = new LinkedHashSet<>();
		city.add("Latur");
		city.add("Kolhapur");
		city.add("Nanded");
		
		System.out.println("\n cities Are : "+city);
		
		System.out.println("\n cities Are : ");
		for(String tempCity : city ){
		System.out.println(tempCity);
		}

		System.out.println("\n cities Are : ");
		Iterator<String> itrCity = city.iterator();
		while(itrCity.hasNext()){
		System.out.println(itrCity.next());
		}

		LinkedHashSet<String> city2 = new LinkedHashSet<>();
		city2.add("Nanded");
		city2.add("Jalgaon");
		city2.add("pune");

		city2.retainAll(city);		
		
		System.out.println("\n Intersection Of Two City : "+city2);

	}

}
