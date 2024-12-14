class Solution {
   public boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer,Integer> checker= new HashMap<>();
       for(int i=0;i<nums.length;i++)
       { if(checker.containsKey(nums[i]) && i-checker.get(nums[i])<=k)
           return true;
          checker.put( nums[i],i);

       }
       return false;
    }
}