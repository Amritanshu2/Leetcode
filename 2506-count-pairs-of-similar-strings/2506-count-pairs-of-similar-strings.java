class Solution {
    public int similarPairs(String[] words) {

        HashSet<Character> hset=new HashSet<>();
        HashSet<Character> hset2=new HashSet<>();
        int countk=0;
        for(int i=0;i<words.length-1;i++){
           for(Character ch: words[i].toCharArray()){
                hset.add(ch);
            }
            for(int j=i+1;j<words.length;j++){
                for(Character ch: words[j].toCharArray()){
                    hset2.add(ch);}
                     if(hset.equals(hset2)) {
                System.out.println(i+" --"+hset+" --"+hset2); 
                countk++;}
                 hset2.clear();  
            }
            
           
                
            hset.clear();
                     
        }

        return countk;
    }
}