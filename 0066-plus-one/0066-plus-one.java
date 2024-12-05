class Solution {
    public int[] plusOne(int[] digits) {
         boolean enough=false;
        int i=digits.length-1;
        if(digits[digits.length-1]!=9)
        {  digits[digits.length-1]+=1;
           return digits;
        }
        else 
        { 
             while(enough==false)
            {     if(i==-1)
                {
                  break;
                }  
                if(digits[i]==9)
                  {
                    digits[i]=0;
                    i--;
                  }
                  else
                  {  
                    enough=true;
                    digits[i]+=1;
                  }   
            }
            if(i==-1)
            {
                int[] newArray=new int[digits.length+1];
                newArray[0]=1;
                for(int j=1;j<digits.length;j++)
                  newArray[j]=digits[j-1];
                
                digits=newArray;
                newArray=null;
            }  
            
        }
        return digits;
    }
}