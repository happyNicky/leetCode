class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min=0;
         int j=0;
        while(j<k)
        {  for(int i=0;i<nums.length;i++)
            if(nums[i]<nums[min])
               min=i;
            nums[min]*=multiplier;
            min=0;
            j++;
        }
        return nums;
      
    }
}