class Solution {
    public int minimumRecolors(String blocks, int k) {

    int countW=k;
    // int count=0;
    int n=blocks.length();
    
    for(int i=0;i+k-1<n;i++)
    {
           int count=0;
        
        for(int j=i;j<i+k;j++)
        {
            char ch1=blocks.charAt(j);
        
        if(ch1=='W' )
        {
            
            count++;
        
        }
      }
        
        countW=Math.min(count,countW);
    }
    
return countW;
}
}