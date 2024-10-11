import java.util.*;

class Palindrome {
    public boolean isPalindrome(int number) {
        if(number<0) {
            return false;
        } 
        
        int result = 0 ,  reminder, originalNumber;

        originalNumber = number;


        while(number != 0 ) {

            reminder = number%10;
            result =  result * 10 + reminder;
            number /= 10;

        }

        if(result == originalNumber) {
            return true;
        } else {
            return false;
        }
        
    }
}

public class lq2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for check: ");
        int number =  sc.nextInt();

        Palindrome obj = new Palindrome();
        boolean res = obj.isPalindrome(number);

        if (res) {
            System.out.println("Number entered is palindrome");
            
        } else {
            System.out.println("Number entered is not plaindrome");
        }

    
    }
}