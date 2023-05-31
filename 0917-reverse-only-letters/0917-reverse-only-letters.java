class Solution {
    public String reverseOnlyLetters(String s) {
        ArrayList<Character> ar = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            System.out.println((int)s.charAt(i));
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<= 90){
                ar.add(s.charAt(i));
            }
            else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                ar.add(s.charAt(i));
            }
        }
        
        int a = ar.size()-1;System.out.println(ar);String h = "";
        for(int i = 0;i<s.length();i++){
            
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<= 90){
                h = h+ ar.get(a);a--;
            }
            else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                h = h+ ar.get(a);a--;
            }
            else{
                h = h+ s.charAt(i);
            }
        }
       
        //     if(((int)s.charAt(i)<= 65 && (int)s.charAt(i)>= 90) || ((int)s.charAt(i)<= 97 && (int)s.charAt(i)<= 122)){
        
        
        return h;
        
    }
}