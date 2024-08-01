class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0;i<details.length;i++){
            if(details[i].charAt(details[i].length()-4)-'0'>=6 && !"60".equals(details[i].substring(details[i].length()-4,details[i].length()-2))){count++;}
            
        }
        return count;
    }
}