//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends



class Queues
{
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> hq = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    q.add(a);	
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    if(q.size()==0){return -1;}
        while(q.size()!=1){
            int s = q.remove();
            hq.add(s);
        }
        int m = q.remove();
        while(hq.size()!=0){
            int s = hq.remove();
            q.add(s);
        }
        return m;
    }
	
}

