//Given a roman numeral, convert it to an integer.

//Input is guaranteed to be within the range from 1 to 3999.

class Solution {
    public int romanToInt(String s) {
         char[] c = s.toCharArray();
        int[] number = new int[s.length()];
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'I':
                    number[i] = 1;
                    break;
                case 'X':
                    number[i] = 10;
                    break;
                case 'C':
                    number[i] = 100;
                    break;
                case 'M':
                    number[i] = 1000;
                    break;
                case 'V':
                    number[i] = 5;
                    break;
                case 'L':
                    number[i] = 50;
                    break;
                case 'D':
                    number[i] = 500;
                    break;

            }

        }
        int sum = 0;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] < number[i + 1]) {
                sum -= number[i];
            } else {
                sum += number[i];
            }
        }
        return sum + number[number.length - 1];
        
    }
}
