class Solution {
    public  boolean isPalindrome(String s) {
        for(int i=0;i<s.length();i++)
        {  if( s.charAt(i)<48 || (s.charAt(i)>57 && s.charAt(i)<'A')||(s.charAt(i)>'Z' &&              s.charAt(i)<'a')||s.charAt(i)>'z' )
           s= s.replace(s.charAt(i), ' ');
        }
       s= s.replaceAll(" ","").toLowerCase();
       System.out.println(s);
        return s.equals(new StringBuilder(s).reverse().toString());
      }

    }
