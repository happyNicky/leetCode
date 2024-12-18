class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int cheker=0;
        for(int i=0;i<nums.length;i++)
        {  cheker+=nums[i];
           if(cheker==0)
             count++;    
        }
        return count;
        
    }
}