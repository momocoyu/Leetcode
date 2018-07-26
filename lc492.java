class Solution {
    public int[] constructRectangle(int area) {
        int[] re = new int[2];

        for(int i=(int) Math.sqrt(area);i>=i;i--){
            if(area%i==0){
                re[0]=area/i;
                re[1]=i;
                break;
            }
            
        }

        return re;
    }
}
