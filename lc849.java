class Solution {
    public int maxDistToClosest(int[] seats) {
        int count=0;
        int left = -1;
        int right = -1;
        int maxleft = 0;
        int maxright = 0;
        int max=0;
        for(int i = 0;i<seats.length;i++){
            if(seats[i]==1){
                count++;
                maxright = seats.length-1-i;
                if(left == -1){
                    maxleft = i;
                    left = i;
                }
                else if(right == -1){
                    right = i;
                    max = right -left;
                }
                else{
                    max = Math.max(max,i-right);
                    left = right;
                    right = i;
                }
            }
        }
        if(count == 1) return Math.max(maxleft,maxright);
        else{
            maxleft = Math.max(maxleft,maxright);
            max = max / 2;
            return Math.max(maxleft,max);
        }
    }
}