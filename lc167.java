//这种做法忽视了input是asscending order，程序复杂度过高
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] index = new int[2];
//        for(int i = 0; i<numbers.length-1;i++ ){
//            for ( int j =i+1 ;j<numbers.length;j++){
//                if(numbers[i]+numbers[j]==target){
//                    index[0]=i;
//                    index[1]=j;
//                    return index;
//                }
//            }
//        }
//        return index;
//
//    }


    public static int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j= numbers.length-1;
        int[] index = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]>target) j--;
            else if(numbers[i]+numbers[j]<target) i++;
            else if(numbers[i]+numbers[j]==target) {
                index[0]=i+1;
                index[1]=j+1;
                return index;
            }
        }

    return index;
    }
