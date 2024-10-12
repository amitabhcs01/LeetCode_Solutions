import java.util.*;
class Solution {
    public int romanToInt(String s) {

        int prevVal  = 0 ;
        int total = 0;
        

        for (int i = s.length() - 1; i >= 0; i--) {
         
            int value = romanToInt(s.charAt(i));   
            
            if (prevVal > value) {
                
                total = total - value;
            } 
            else{
                total = total + value;
            }
           
        }
        return total;

    }
        


        private int romanToInt(char c) {
        switch( c ) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
             }
            
    
}
}
public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman value: ");
        String s = sc.nextLine();


        Solution obj = new Solution();
        int result = obj.romanToInt(s);
        System.out.println(result);;
        
    }
}