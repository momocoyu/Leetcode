class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder result= new StringBuilder();
 
        String re ="";
        if(num<0){
            re+="-";
            num=-num;
        }
        
        while(num!=0){
            
            result.append(num%7);
            num/=7;
        }
        result = result.reverse();
        re+=result.toString();
        return re;
    }
}
