class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0; i<bills.length;i++){
            switch(bills[i]){
                case 5:
                    five++;
                    break;
                case 10:
                    if(five == 0) return false;
                    five--;
                    ten++;
                    break;
                case 20:
                    if(five ==0) return false;
                   
                    else if(ten>0&&five>0){
                        five--;
                        ten--;
                    }
                     else if(ten == 0){
                        if(five <= 3) return false;
                        else five -=3;
                    }
                    break;
            }
        }
        return true;
    }
}