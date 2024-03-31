class Solution {
    public int closetTarget(String[] words, String target, int i) {
        int dl = i-1,dr = i+1;int dis = 1;int mind = -1;
        if(words[i].equals(target)){return 0;}
        while(dis<= words.length){
            
            if(dl<0){dl = words.length-1;}
            if(words[dl].equals(target)){mind = dis;break;}
            dl--;dis++;
        }
        dis = 1;
        while(i != dr && dis<mind){
            if(dr>=words.length){dr = 0;}
            if(words[dr].equals(target)){mind = Math.min(dis,mind);break;}
            dr++;dis++;
        }
        return mind;
    }
}