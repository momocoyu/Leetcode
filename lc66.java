//Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

//You may assume the integer do not contain any leading zero, except the number 0 itself.

//The digits are stored such that the most significant digit is at the head of the list.



class Solution {
     public int[] plusOne(int[] digits) {
        ArrayList<Integer> temp =new ArrayList<>();
        boolean carry=false;
        if(digits[digits.length-1]==9){
            temp.add(0);
            carry=true;
        }
        else {
            temp.add(digits[digits.length-1]+1);
        }
        for(int i=digits.length-2;i>=0;i--){
            if(carry==true){
                if(digits[i]==9){
                    temp.add(0);
                    carry=true;
                }
                else {
                    temp.add(digits[i]+1);
                    carry=false;
                }
            }
            else {
                temp.add(digits[i]);
            }


        }
        if(carry==true) temp.add(1);
        int[] result=new int[temp.size()];
        int k=0;
        for(int i=temp.size()-1;i>=0;i--){
            result[k]=temp.get(i);
            k++;
        }
        return result;
    }
}
