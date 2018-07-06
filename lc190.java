public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));

        while (sb.length()<32){
           sb.insert(0,0);
        }
        sb.reverse();
    
       
        return Integer.parseUnsignedInt(sb.toString(),2);
        
    }
}




public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return Integer.reverse(n);
        
    }
}
