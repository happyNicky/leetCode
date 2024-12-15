class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> temp= new ArrayList<>();
        List<Integer> tempInner= new ArrayList<>();
        if(numRows==1)
        {    tempInner.add(1);
             temp.add(tempInner);
             return temp;
        }
            tempInner.add(1);
            temp.add(tempInner);
            tempInner= new ArrayList<>();
            tempInner.add(1);
            tempInner.add(1);
            temp.add(tempInner);
        
            int x=0;
            int y=0; 
            tempInner= new ArrayList<>();
        for(int i=2;i<numRows;i++)
        { 
             tempInner.add(1);
             int k=temp.get(i-1).size()-1;
            for(int j=0;j<k;j++)
            {  x= temp.get(i-1).get(j);
               y=temp.get(i-1).get(j+1);
               tempInner.add(x+y);
            }
            tempInner.add(1);
            temp.add(tempInner);
            tempInner= new ArrayList<>();
        }
       return temp;
    }
}