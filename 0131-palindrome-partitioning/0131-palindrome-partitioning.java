class Solution {
    
    List<List<String>> ans = new ArrayList<>();
    HashMap<String,Boolean>hm = new HashMap<>();
    
    public List<List<String>> partition(String s) {
        part(s,new ArrayList<>(),0,"");
        return ans;
    }
    
    public void part(String s, List<String>al , int i, String as){
        if(i == s.length()){
            int a = 0;
            if(as.length()>0){al.add(as);a++;}
            if(check(al)){ans.add(new ArrayList<>(al));}
            if(a>0) al.remove(al.size()-1);
            return;
        }
        
        
        
        if(as.length()!=0){
            al.add(as);
            part(s,al,i+1,""+s.charAt(i));
            al.remove(al.size()-1);
        }
        
        part(s,al,i+1,as+s.charAt(i));
        
    }
    
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public  boolean check(List<String> strings) {
        for (String str : strings) {
            if(hm.containsKey(str) && hm.get(str) == false){return false;}
            if(hm.containsKey(str)){continue;}
            if (!isPalindrome(str)) {
                hm.put(str,false);
                return false;
            }
            else{hm.put(str,true);}
        }
        return true;
    }
    
}