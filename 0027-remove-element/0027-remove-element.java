class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0,k=0;
         while (k<nums.length) {
              j=i;
              if(nums[i]==val)
              {  
                while (j<nums.length-1) {
                    nums[j]=nums[j+1];
                    j++;
                }
              }
             else 
             i++;
             k++;
         }
        return i;
    }
}