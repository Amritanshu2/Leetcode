//{ Driver Code Starts
import java.util.*;


class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends


class Queue
{
    Stack<Integer> q = new Stack<Integer>(); 
    Stack<Integer> hq = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    if(q.size()==0){return -1;}
        
        while(q.size()!=1){
            int s = q.pop();
            hq.push(s);
        }
        int m =  q.pop();
        while(hq.size()!=0){
            int s = hq.pop();
            q.push(s);
        }
        return m;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    q.push(x);
    }
}

