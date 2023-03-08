//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node temp = head;int i = 0;
    	while(temp != null){
    	    temp = temp.next;i++;
    	}
    	int [] arr = new int [i];
    	temp = head;
    	for(int j = 0;j<i;j++){
    	    arr[j] = temp.data;
    	    temp = temp.next;
    	}
    	
    	
    	for(int j = 0;j < i/2;j++){
    	    int temp1 = arr[j];
    	    arr[j] = arr[i-1-j];
    	    arr[i-1-j] = temp1;
    	}
    	temp = head;
    	for(int j = 0;j<i;j++){
    	    temp.data = arr[j];
    	    temp = temp.next;
    	}
    	return head;
    }
}
