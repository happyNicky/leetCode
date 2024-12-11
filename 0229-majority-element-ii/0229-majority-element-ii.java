class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> re= new ArrayList<>();
           Map<Integer,Integer> temp=new HashMap<>();
           for(int i=0;i<nums.length;i++)
           {  temp.put(nums[i],temp.getOrDefault(nums[i],0)+1 );
               if(temp.get(nums[i]).intValue()>(nums.length)/3 && !re.contains(nums[i]))
                   re.add(nums[i]);
              
           }
          return re;
    }
}