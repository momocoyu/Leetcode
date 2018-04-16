//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y =reverse(x);
        if(y==x) return true;
        return false;
    }
    public int reverse(int x) {
        ArrayList<Integer> temp =new ArrayList<>();
        int result;

        double number=0;
        while(x!=0){
            result=x%10;
            temp.add(result);
            x/=10;
        }
        for(int i=0;i<temp.size();i++){
            number*=10;
            number+=temp.get(i);

        }
        if(number<=Integer.MAX_VALUE &&number>=Integer.MIN_VALUE)
            return (int) number;
        return 0;
    }
}
