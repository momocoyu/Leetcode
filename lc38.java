//The count-and-say sequence is the sequence of integers with the first five terms as following:

//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221


class Solution {
        public String countAndSay(int n) {
        if (n == 1) return "1";
        if(n<=0) return null;
        StringBuilder sb = new StringBuilder();
        String result = countAndSay(n-1);
        int i=0;
        int count=0;
        char temp=result.charAt(0);
        while(i<result.length()){
            if((result.charAt(i)==temp)&&(i<result.length())){
                count++;
                i++;
            }
            else {
                sb.append(count).append(temp);
                temp=result.charAt(i);
                count=1;
                i++;
            }

        }
        sb.append(count).append(temp);
        return sb.toString();

    }
}
