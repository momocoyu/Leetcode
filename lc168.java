//这题需要注意的是z的判断
public static String convertToTitle(int n) {
        int res;
        char c;
        StringBuilder str = new StringBuilder();
        while( n != 0){
            res = n%26;
            n = n/26;
            if(res !=0 ) {
                c = (char) ('A'-1+res);
               str.append(c);

            }
            else if(res==0 && n>0){
                str.append('Z');
                n=n-1;
            }


        }
        return str.reverse().toString();
    }
