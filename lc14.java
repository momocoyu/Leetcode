//Write a function to find the longest common prefix string amongst an array of strings.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        ArrayList<Character> characters = new ArrayList<>();
        int temp = -1;
        if (strs.length == 0) return "";
        char[] c0 = strs[0].toCharArray();
        for (int i = 0; i < c0.length; i++) {
            characters.add(c0[i]);
        }
        for (int i = 1; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            if (characters.size() < c.length) {
                for (int j = 0; j < characters.size(); j++) {

                    if (c[j] != characters.get(j)) {
                        temp = j;
                        System.out.println(characters.toString());
                        break;
                    }
                }
            } else {
                for (int j = 0; j < c.length; j++) {
                    if (c[j] != characters.get(j)) {
                        temp = j;
                        System.out.println(characters.toString());
                        break;
                    }
                }
                for(int m =characters.size()-1;m>c.length-1;m--) {
                    characters.remove(m);
                }

            }
            if(temp!=-1) {
                for (int k = characters.size() - 1; k >= temp; k--) characters.remove(k);
            }
        }
        String result = "";
        for (int i = 0; i < characters.size(); i++) {
            result += characters.get(i);
        }
        return result;

    }
}
