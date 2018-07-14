class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s=str.split(" ");
        char[] p =pattern.toCharArray();
        int[] p1 = new int[pattern.length()];
        int[] p2 = new int[s.length];
        
        if(pattern.length()!=s.length) 
            return false;
        
        int temps=1;
        int tempp=1;
        
        for(int i=0;i<s.length;i++){
           p1[i]=0;
           p2[i]=0;
        }
        
        for(int i=0;i<s.length;i++){
            if(p1[i]==0){
                p1[i]=temps;
                temps++;
                for(int j=i;j<s.length;j++){
                    if(p[i]==p[j])
                        p1[j]=p1[i];
                }
            }
        }
        
          for(int i=0;i<s.length;i++){
            if(p2[i]==0){
                p2[i]=tempp;
                tempp++;
                for(int j=i;j<s.length;j++){
                    if(s[i].equals(s[j]))
                        p2[j]=p2[i];
                }
            }
        }
        
        for(int i=0;i<s.length;i++){
            if(p1[i]!=p2[i])
                return false;
            
        }
        return true;
        
    }
}
