class Solution {
    public String addBinary(String a, String b) {
         int max=Math.max(a.length(), b.length());
         String ans="";
         boolean carry=false;
       char A[]=new char[max];
       char B[]=new char[max];
       int j=0;
       for(int i=a.length()-1;i>=0;i--)
       {   A[j]=a.charAt(i);
            j++;
       }
       j=0;
       for(int i=b.length()-1;i>=0;i--)
       {   B[j]=b.charAt(i);
            j++;
       }
       if(a.length()>b.length())
        for(int i=b.length();i<max;i++)
             B[i]='0';
       else
        for(int i=a.length();i<max;i++)
               A[i]='0';

      for(int i=0;i<max;i++)
      {
        if(A[i]=='1'&& B[i]=='1' && carry==false)
        {
         carry=true;
         ans+="0";
        }
        else if(((A[i]=='0'&&B[i]=='1')||(A[i]=='1'&&B[i]=='0'))&& carry==false)
        ans+="1";
        else if((A[i]=='0'&&B[i]=='0')&& carry==false)
        ans+="0";
        else if(A[i]=='1'&& B[i]=='1' && carry==true)
          {
           carry=true;
           ans+="1";
          }
        else if(((A[i]=='0'&&B[i]=='1')||(A[i]=='1'&&B[i]=='0'))&& carry==true)
         {    carry=true;  
            ans+="0";
         }
         else if((A[i]=='0'&&B[i]=='0')&& carry==true)
         {
             carry=false;
             ans+="1";
         }
      }
        if(carry==true)
        ans+=1;
        ans=new StringBuilder(ans).reverse().toString();    
        return ans;
    }
}