//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int nums[], int size)
    {
        Arrays.sort(nums);
        int i = 0;int j  = 0;
        for(int k = 0;k<nums.length;k++){
            if(nums[k]==1){
                i = nums[k];
                j = k;
                break;
            }
        }
        if(i == 0){return 1;}
        while(j < nums.length-1){
            if(nums[j] != nums[j+1]-1 && nums[j] != nums[j+1]){
                return  nums[j]+1;
            }j++;
        }
    
        return nums[nums.length-1]+1;
    }
}








//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends