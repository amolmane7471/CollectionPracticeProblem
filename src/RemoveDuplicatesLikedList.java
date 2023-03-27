import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesLikedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(15);
		list.add(19);
		list.add(10);
		
		System.out.println("List Before Removing Duplicates :");

		for(Integer tempList : list) {
			System.out.println(tempList);
		}
		
		List<Integer> withoutDuplicateList = list.stream().distinct().
				collect(Collectors.toList());
       
		System.out.println("\n List After Removing Duplicates :");

		for(Integer temp : withoutDuplicateList) {
			System.out.println(temp);
		}
	}

}
