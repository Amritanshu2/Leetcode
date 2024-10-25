import java.util.*;

class Solution {
    HashSet<String> hs = new HashSet<>();
    
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        
        for (String currentFolder : folder) {
            StringBuilder a = new StringBuilder(); 
            boolean isSubfolder = false;
            
            for (int j = 0; j < currentFolder.length(); j++) {
                a.append(currentFolder.charAt(j)); 
                
                
                if (hs.contains(a.toString()) && (j == currentFolder.length() - 1 || currentFolder.charAt(j + 1) == '/')) {
                    isSubfolder = true;
                    break;
                }
            }
            
            if (!isSubfolder) {
                hs.add(currentFolder);
            }
        }
        
        return new ArrayList<>(hs);
    }
}
