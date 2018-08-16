class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i<bits.length){
            if(bits[i]==0 && i==bits.length-1)
                return true;
            else if(bits[i]==1 && i==bits.length-2)
                return false;
            else if(bits[i]==0) i++;
            else if(bits[i]==1) i+=2;
        }
        return false;
    }
}