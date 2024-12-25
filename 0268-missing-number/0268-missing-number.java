class Solution {
    public int missingNumber(int[] nums) {
       int max=nums.length;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
            sum+=nums[i]; 
        
      max= (max*(max+1))/2;
        return max-sum;
             
          
    }
}