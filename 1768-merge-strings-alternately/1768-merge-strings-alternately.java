class Solution {
    public String mergeAlternately(String word1, String word2) {
         String newWord="";
          int length;
           if(word1.length()<word2.length())
             length=word1.length();
            else 
            length=word2.length();
            for(int i=0;i<length;i++)
            {  newWord+=word1.charAt(i);
             newWord+=word2.charAt(i);
            }
            if(length<word1.length())
              newWord+=word1.substring(length);
            else if(length<word2.length())
              newWord+=word2.substring(length);
          return newWord;
    }
}