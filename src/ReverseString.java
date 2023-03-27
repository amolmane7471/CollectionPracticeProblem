import java.util.Stack;

public class ReverseString {

	public static String stringReverse(String str) {
	
		char[] revString = new char[str.length()];
		
		Stack<Character> charStack = new Stack<>();
		
		for( int i = 0 ; i < str.length() ; i++ ) {
			charStack.push(str.charAt(i));
			System.out.println("\n Char inserted in stack are : "+charStack);
		}
		
		
		for( int i = 0 ; i < str.length(); i++) {
			revString[i] = charStack.pop();
			System.out.println("\n Char removed from stack is : "+revString[i]);
		}
		
		return new String(revString);
	}
	
	public static void main(String[] args) {
		
		String str = "java";
		
		System.out.println("\n Reverse Of "+ str +" is : "+stringReverse(str));
	}

}
