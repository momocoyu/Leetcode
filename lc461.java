class Solution {
    public int hammingDistance(int x, int y) {
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        
        while(xs.length()<ys.length()){
            xs = "0" +xs;
        }
        
         while(ys.length()<xs.length()){
            ys = "0" +ys;
        }
        
        int count = 0;
        int k;
        
        for(k =0 ;k<xs.length();k++){
            
            if(xs.charAt(xs.length()-k-1)!=ys.charAt(ys.length()-k-1)){
                count++;
            }
       
        }
        
       return count;
    }
    
}
