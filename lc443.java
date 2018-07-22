class Solution {
    public int compress(char[] chars) {
        if(chars.length==0) return 0;
        int i=1;
        char temp =chars[0];
        int count=1;
        int size=1;
        while(i < chars.length){
            if(chars[i]==temp){
                count++;
                i++;
            }
            
            else{
                temp=chars[i];        
                if(count ==1);
                else{
                    String str = String.valueOf(count);
                    
                    for(int j =size;j<size+str.length();j++){
                        chars[j] =str.charAt(j-size);
                    }
                    size += str.length();
                }
                chars[size] = temp;
                size++;
                i++;
                count=1;
                
            }
        }
        if(count ==1);
        else{
             String str = String.valueOf(count);
                    
             for(int j =size;j<size+str.length();j++){
                    chars[j] =str.charAt(j-size);
             }
        size += str.length();
        }
        
        
        return size;
    }
}
