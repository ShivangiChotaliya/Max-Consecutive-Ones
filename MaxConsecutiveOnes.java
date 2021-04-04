/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
*/

import java.util.Scanner;
import java.lang.*;
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums,int n) {    
        int[] temp = new int[1000];
        
        int cnt=0,j=0;

        for(int i=0;i<n;i++){
            if(nums[i]==1){   
                temp[j]++;
            }
            if(nums[i]==0)
            {
                j++;
            }
        }
        return Maximum(temp,j);
    }

    // finding Maximum from Array
    public static int Maximum(int[] nums,int n){
       int max = nums[0];
        for(int i=1;i<=n;i++){
            if(nums[i]>max){
                max =nums[i];
            }
        }
        return max;
    }
    
    public static void Input(int[] nums,int n){
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<n;i++){
            System.out.println("Enter value(0/1) :");
            nums[i]=sc.nextInt();
            
            while(!(nums[i]==0 ||  nums[i]==1)){
                System.out.println("Invalid... Enter value(0/1) :");
                nums[i]=sc.nextInt();
                
            }
        }
        
    }
    public static void main(String args[]){
    
        
        int[] nums = new int[10000];
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size:");
        n = sc.nextInt();
        
        // input
        Input(nums,n);
        
        int res = findMaxConsecutiveOnes(nums,n);
        System.out.println("Max  Consicutive no is : " + res);
    }
}