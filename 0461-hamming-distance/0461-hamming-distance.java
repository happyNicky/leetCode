class Solution {
   public int hammingDistance(int x, int y) {
      String a,b;
       a= Integer.toBinaryString(x);
       b=Integer.toBinaryString(y);
      System.out.println(a);
      System.out.println(b);
       if(a.length()<b.length())
        for(int i=0;i<(b.length()-a.length());)
               a='0'+a;     
       else if(b.length()<a.length())
        for(int i=0;i<a.length()-b.length();)
               b='0'+b;
            x=0;
            System.out.println(a);
            System.out.println(b);
       for(int i=0;i<a.length();i++)
       {  if(a.charAt(i)!=b.charAt(i))
             x++;
       }
        return x;
    }
}