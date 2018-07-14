/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 1;
        int last = n;
        int mid = first+(last-first)/2;
        while(guess(mid)!=0){
            mid = first+(last-first)/2;
            if(guess(mid)==-1){
                last=mid-1;
            }
            else if(guess(mid)==1){
                first=mid+1;
            }
        }
        return mid;
    }
}
