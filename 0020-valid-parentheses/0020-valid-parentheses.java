class Solution {
    public boolean isValid(String s) {
         Stack<Character> temp= new Stack<>();
         temp.push(s.charAt(0));
         int i=1;
         while(i<s.length())
         {  temp.push(s.charAt(i));
             if(temp.peek()==')')
            {    if(temp.size()!=1)
                  temp.pop();
                if(temp.pop()!='(')
                return false;
            }
             else if(temp.peek()=='}')
             {    if(temp.size()!=1)
                  temp.pop();
                if(temp.pop()!='{')
                return false;
             }
           else if(temp.peek()==']'){
              if(temp.size()!=1)
                temp.pop();
               if(temp.pop()!='[')
                return false;
            }
            i++;
         }
         if(!temp.isEmpty())
          return false;
         return true;
    }
}