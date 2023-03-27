
public class DuplicateChar {

	public static void main(String[] args) {
		String str = "Hello All";

		char[] charArry = str.toCharArray(); 
		
		System.out.println(" Duplicate Characters are : ");
		
		for (int i = 0; i < str.length(); i++) {
	
			for (int j = i + 1; j < str.length(); j++) {

				if (charArry[i] == charArry[j]) {
					System.out.println(charArry[i]);
					break;
					}
				}
		  }

	}

}
