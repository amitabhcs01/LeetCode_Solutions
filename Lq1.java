// package LeetCode;

import java.util.Scanner;

class TwoSum{

    public int[] twoSum(int nums[] , int target) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]  {i,j};
                }
            }
           
        }
        return new int[] {};
    }

}

public class Lq1 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of element you want to enter: ");
                int n = sc.nextInt();

                int nums[] = new int[n];
                
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = sc.nextInt();
                }

                System.out.println("Enter target element: ");
                int target  = sc.nextInt();

                TwoSum obj = new TwoSum();
               int [] result =  obj.twoSum(nums, target);

               if(result.length == 2) {
                System.out.println("Index = " + result[0] + " , " + result[1]);
               } else{
                System.out.println("No two sum found");
               }
            

            
        }

    
}
