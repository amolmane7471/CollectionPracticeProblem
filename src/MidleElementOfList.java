import java.util.LinkedList;

public class MidleElementOfList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
    	list.add(50);	

    	for(Integer temp : list) {
			System.out.println(temp);
		}
		
		int middleElement = list.get((list.size()-1)/2);
		
		System.out.println("middle element is : "+middleElement);
	}
	
//	    Node head;  
//	     class Node 
//	    { 
//	        int data; 
//	        Node next;
//	        Node(int d) 
//	        { 
//	            data = d; 
//	            next = null; 
//	        } 
//	    } 
//	   
//	    public void middle_element() 
//	    { 
//	        Node pointer1 = head; 
//	        Node pointer2 = head; 
//	      
//	        while (pointer2 != null && pointer2.next != null) 
//	        { 
//	            pointer1 = pointer1.next; 
//	        	pointer2 = pointer2.next.next; 
//	      
//	        } 
//	        System.out.println("\n The middle element is : " + pointer1.data ); 
//	    } 
//	    
//	    public void add(int data) 
//	    { 
//	        Node new_node = new Node(data);
//	        new_node.next = head; 
//	        head = new_node; 
//	    } 
//	    
//	    public void print_list() 
//	    { 
//	        Node temp = head; 
//	        while (temp != null) 
//	        { 
//	            System.out.print(temp.data +"->"); 
//	            temp = temp.next; 
//	        } 
//	        System.out.println("null"); 
//	    } 
//	    
//	    public static void main(String[] args)
//	    {
//	       MidleElementOfList list = new MidleElementOfList();
//	       
//	        list.add(10);
//	        list.add(20);
//	        list.add(30);
//	        list.add(40);
//	        list.add(50);
//	        
//	        list.print_list();
//	        list.middle_element();
// 
//	    }

}
