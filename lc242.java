class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int[] nums =new int[26];
        for(int i=0;i<nums.length;i++){
            nums[i]=0;
        }
        for(char c:ss){
            nums[c-'a']++;
        }
        for(char c:ts){
            nums[c-'a']--;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0);
            else return false;
        }
        return true;
    }
}
