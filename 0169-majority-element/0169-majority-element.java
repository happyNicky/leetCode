class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
         int x=nums[0];
         int count=1;
        for(int i=1;i<nums.length;i++)
        {   
              if(nums[i]==x)
               count++;  
              else if(nums[i]!=x)
                  count--;
              if(count==0)
              { x=nums[i];
                count++;
                  
              }
              
            
        }
        return x;
    }
}