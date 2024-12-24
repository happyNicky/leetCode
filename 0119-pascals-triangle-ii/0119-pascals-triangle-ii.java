class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> ans= new ArrayList<>();                         
         ans.add(1);
        if(rowIndex==0)
           return ans;
        if(rowIndex==1)
        {  ans.add(1);
           return ans; 
        }
        List<List<Integer>> temp= new ArrayList<List<Integer>>();
          temp.add(new ArrayList<>());
           temp.get(0).add(1);
           temp.add(new ArrayList<>());
          temp.get(1).add(1);
          temp.get(1).add(1);
        for(int i=1;i<rowIndex;i++)
        {    temp.add(new ArrayList<>());
             temp.get(i+1).add(1);
            for(int j=0;j<temp.get(i).size()-1;j++)
             temp.get(i+1).add(temp.get(i).get(j)+temp.get(i).get(j+1));
             temp.get(i+1).add(1);
        }
       
       
        return temp.get(rowIndex); 
            
        }
    }
