class Solution {
    public int[] diStringMatch(String s) {
        int[] result=new int[s.length()+1];
        int i_counter=0,j_counter=s.length();
        int lenghtOfS=s.length();
        for(int i=0;i<lenghtOfS;i++)
        {  if(s.charAt(i)=='I')
             { result[i]=i_counter;
                i_counter++;
             }
            else
            { result[i]=j_counter;
                j_counter--; 
            }
                
        }
        if(s.charAt(lenghtOfS-1)=='I')
         result[s.length()]=i_counter;
         result[s.length()]=j_counter;
        return result; 
    }
}