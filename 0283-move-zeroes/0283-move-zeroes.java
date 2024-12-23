class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int i=0;
       while(i<nums.length-count) 
       {  if(nums[i]==0)
          {  for(int j=i;j<nums.length-count-1;j++)
              {   nums[j]=nums[j+1];
                }
            count++;
            nums[nums.length-count]=0;
            if(nums[i]!=0)
                i++;
            
          }
          else 
              i++;
           
       }
    }
}