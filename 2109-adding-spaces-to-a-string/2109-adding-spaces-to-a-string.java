class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder temp= new StringBuilder(s);
         for(int i=0;i<spaces.length;i++)
          temp.insert(spaces[i]+i, " ");
        return temp.toString();
      
    }
}