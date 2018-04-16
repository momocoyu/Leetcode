//Given two binary strings, return their sum (also a binary string).

class Solution {
public String addBinary(String a, String b) {
        char[] numA = a.toCharArray();
        char[] numB = b.toCharArray();
        int length;
        if(a.length()>b.length()) {
            length= b.length();
        }
        else {
            length =a.length();
        }
        boolean carry=false;

        ArrayList<Character> temp =new ArrayList<>();
            int i=a.length()-1;
            int j=b.length()-1;
            while(length>0) {
                if (!carry) {
                    if (numA[i ] == '1' && numB[j] == '1') {
                        temp.add('0');
                        carry = true;
                        i--;
                        j--;
                        length--;
                    } else if (numA[i] == '0' && numB[j] == '0') {
                        temp.add('0');
                        carry = false;
                        i--;
                        j--;
                        length--;
                    } else {
                        temp.add('1');
                        carry = false;
                        i--;
                        j--;
                        length--;
                    }
                } else {
                    if (numA[i] == '1' && numB[j] == '1') {
                        temp.add('1');
                        carry = true;
                        i--;
                        j--;
                        length--;
                    } else if (numA[i] == '0' && numB[j] == '0') {
                        temp.add('1');
                        carry = false;
                        i--;
                        j--;
                        length--;
                    } else {
                        temp.add('0');
                        carry = true;
                        i--;
                        j--;
                        length--;
                    }
                }
            }



        if(a.length()>b.length()) {
            for(int k=a.length()-b.length()-1;k>=0;k--){
                if(carry){
                    if(numA[k]=='1'){
                        temp.add('0');
                        carry=true;
                    }
                    else {
                        temp.add('1');
                        carry=false;
                    }
                }
                else{
                    temp.add(numA[k]);
                    }
                }
            }
         else if(b.length()>a.length()){
            for(int k=b.length()-a.length()-1;k>=0;k--){
                if(carry){
                    if(numB[k]=='1'){
                        temp.add('0');
                        carry=true;
                    }
                    else {
                        temp.add('1');
                        carry=false;
                    }
                }
                else{
                    temp.add(numB[k]);
                }
            }
        }
        if(carry==true) temp.add('1');
        String str="";
        for(int k=temp.size()-1;k>=0;k--){
            str+=temp.get(k);
        }
        return str;
    }
}
