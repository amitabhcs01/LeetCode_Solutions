import java.util.*;
class Solution {
    public int romanToInt(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            
            int value = romanCharToInt(s.charAt(i));    
        }






        public int romanToInt(char c) {
        switch((c) ) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
             }
            }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman value: ");
        String s[] = new String[15];
       


        Solution obj = new Solution();
        int result = obj.romanToInt();
        
    }
}