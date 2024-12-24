class Solution {
    public boolean isHappy(int n) {
       int result=0;
          int k=0;
          String s=""+n;
          boolean isHapp=false;
          Set<Integer> temp= new HashSet<>();
          while(!isHapp)
          { while(k<s.length())
            {  
               result += Math.pow(Integer.parseInt(""+s.charAt(k)),2);
               k++;
            }
            
            System.out.println(result);
            if(result==1)
            return true;
            else if(temp.contains(result))
           return false;
           temp.add(result);
            s=""+result;
            result=0;
            k=0;
          }
         
       return false;
    }
}