
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.


class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        for(int i=0;i<c.length-1;i++){
            switch (c[i]){
                case '(':

                    boolean flag0=false;
                    for(int j=i+1;j<c.length;j=j+2) {
                        if (c[j] == ')') {
                            c[j] = 0;
                            flag0=true;
                            break;
                        }
                    }
                    if(flag0==true) break;
                    else {
                        return false;
                    }

                case '{':
                    boolean flag1=false;
                    for(int j=i+1;j<c.length;j=j+2) {
                        if (c[j] == '}') {
                            c[j] = 0;
                            flag1=true;
                            break;
                        }
                    }
                    if(flag1==true) break;
                    else {
                        return false;
                    }

                case '[':
                    boolean flag2=false;
                    for(int j=i+1;j<c.length;j=j+2) {
                        if (c[j] == ']') {
                            c[j] = 0;
                            flag2=true;
                            break;
                        }
                    }
                    if(flag2==true) break;
                    else {
                        return false;
                    }

                case ')':
                    return false;

                case ']':
                    return false;
                case '}':
                    return false;
                case 0:
                    break;
            }
        }
        if(c[c.length-1]==0) {
            return true;
        }
        else {
            return false;
        }

    }
}
