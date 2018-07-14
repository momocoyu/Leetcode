class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransom = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        if(ransom.length > mag.length)
            return false;
        for(int i = 0 ; i < ransom.length;i++){
            boolean flag = false;
            for(int j=0;j<mag.length;j++){
                if(ransom[i]==mag[j])
                {
                    flag= true;
                    mag[j] = '=';
                    break;
                }
                
            }
            if(flag==false)
                return false;
        }
        return true;
    }
}
