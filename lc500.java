class Solution {
    public String[] findWords(String[] words) {
        if(words.length ==0 ) return new String[0];
        String top = "qwertyuiop";
        String mid = "asdfghjkl";
        String bot = "zxcvbnm";
        String[] s = new String[words.length];
        int count=0;
        for(int i = 0 ;i<words.length;i++){
            String t = words[i];
            boolean f1=true;
            boolean f2=true;
            boolean f3=true;
            
            for(int j=0;j<t.length();j++){
                String temp="";
                temp+=t.charAt(j);
                temp=temp.toLowerCase();
                if(!top.contains(temp))
                    f1=false;
                if(!mid.contains(temp))
                    f2=false;
                if(!bot.contains(temp))
                    f3=false;
            }
            
            if(f1||f2||f3){
                s[count]=t;
                count++;
            }
        }
        String[] ss = new String[count];
        
        for(int i=0;i<count;i++){
            ss[i]=s[i];
        }
        return ss;
        
    }
}
