import java.util.Scanner;

class Solution {
    public int minElement(int[] nums) {
        int[] newArr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;  // Reset sum for each element in nums
            int num = nums[i];
            while (num > 0) {
                int reminder = num % 10;
                sum += reminder;
                num /= 10;
            }
            newArr[i] = sum;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < newArr.length; i++) {
            if (min > newArr[i]) {
                min = newArr[i];
            }
        }
        
        return min;
    }
}

public class L3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements you want to enter in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int res = obj.minElement(nums);
        System.out.println("Minimum sum of digits in any element: " + res);
    }
}
