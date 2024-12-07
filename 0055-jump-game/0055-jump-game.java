class Solution {
    public boolean canJump(int[] nums) {
     boolean canJump=false;
        if(nums.length==1)
            return true;
        else if(nums.length>1 && nums[0]==0)
            return false;
        int sum=0;
        int distance=1;
        for(int i=nums.length-2;i>=0;i--)
        {   
            if(nums[i]>= distance)
              {  distance=1;
                canJump=true;
              }
              else
              {
                  distance++;
                  canJump=false;
              }
                
                            
        }
        return canJump;
    }
} 