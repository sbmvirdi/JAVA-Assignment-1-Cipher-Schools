class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
  
public class Q20 
{ 
    Node head; 
  
 
    public int GetNth(int index) 
    { 
        Node current = head; 
        int count = 0; 

        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
  
    
        assert(false); 
        return 0; 
    } 
  
  
    public void push(int data) 
    { 
  
        
        Node node = new Node(data); 
  
        node.next = head; 
  

        head = node; 
    } 
  

    public static void main(String[] args) 
    { 
   
        LinkedList llist = new LinkedList(); 
  

        llist.push(1); 
        llist.push(4); 
        llist.push(1); 
        llist.push(12); 
        llist.push(1); 
  
    
        System.out.println("Element at index 5 is "+llist.GetNth(5)); 
    } 
} 