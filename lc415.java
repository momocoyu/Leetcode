class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int c = 0;
        for(int k =0; k<  Math.min(num1.length(),num2.length()); k++){
            int temp1 = num1.charAt(i) - '0';
            int temp2 = num2.charAt(j) - '0';
            int mm = temp1+temp2 ; 
            sb.append((temp1+temp2+c)%10);
            c = (temp1+temp2+c)/10;
            i--;
            j--;
            
        }
        i = num1.length()-1;
        j = num2.length()-1;
        
        if(i == j ){
            if(c==1) sb.append('1');
            return sb.reverse().toString();
        }
        else if(i < j){
            for(int k = j-i-1;k>=0;k--){
                int temp = num2.charAt(k) - '0';
                sb.append((temp+c)%10);
                c = (temp+c)/10;
            }
            if(c ==1 ) sb.append('1');
            return sb.reverse().toString();
        }
        else {
            for(int k = i-j-1;k>=0;k--){
                int temp = num1.charAt(k) - '0';
                sb.append((temp+c)%10);
                c = (temp+c)/10;
            }
            if(c ==1 ) sb.append('1');
            return sb.reverse().toString();
        }
    }
}
