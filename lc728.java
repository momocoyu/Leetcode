class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList(); 
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i))
                list.add(i);
        }
        return list;
    }
    
    public boolean isSelfDividing(int num){
        int temp = num;
        while(temp > 0){
            int divi = temp % 10;
            if(divi == 0) return false;
            else if(num % divi != 0) return false;
            temp /= 10;
        }
        return true;
    }
}