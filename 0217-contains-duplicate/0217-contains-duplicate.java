class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer,Integer> checker=new HashMap<>();
        for(int i:nums)
        { checker.put(i, checker.getOrDefault(i, 0)+1);
            if(checker.get(i)>1)
              return true;
        }

        return false;
    }
}