class Solution {
    
    HashMap<Character,String> hm = new HashMap<>();
    List<String>al = new ArrayList<>();
    public void sh(){
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
    }
    
    public void num(String nums,String s, int idx){
        if(s.length()==nums.length() && s.length()>0){al.add(s);}
        if(idx >= nums.length()){return;}
        
        String ss = hm.get(nums.charAt(idx));
        for(int i = 0;i<ss.length();i++){
            num(nums,s+ss.charAt(i),idx+1);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        sh();String a = "";
        num(digits,a,0);
        
        return al;
    }
}