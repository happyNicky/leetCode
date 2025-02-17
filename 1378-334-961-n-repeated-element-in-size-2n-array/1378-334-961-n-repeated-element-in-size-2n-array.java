class Solution {
    public int repeatedNTimes(int[] nums) {
        ArrayList<Integer> unique= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        { if(!unique.contains(nums[i]))
            unique.add(nums[i]);
            else 
                return nums[i];
            
        }
        return -1; 

    }
}