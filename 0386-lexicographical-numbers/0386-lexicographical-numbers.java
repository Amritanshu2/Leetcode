class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String>al = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            al.add(i+"");
        }
        Collections.sort(al);
        System.out.println(al);
        List<Integer>as = new ArrayList<>();
        for(int i = 0;i<al.size();i++){
            as.add(Integer.parseInt(al.get(i)));
        }
        return as;
    }
}