//Given a 32-bit signed integer, reverse digits of an integer.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
