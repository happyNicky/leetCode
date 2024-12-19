class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
         if(searchWord.length()> sentence.length())
        return -1;
        int count=1;
        sentence=sentence.trim();
        String sub= sentence.substring(0,searchWord.length());
        
          for(int i=0;i<sentence.length();i+=sub.length())
          {  
             if(sub.equals(searchWord))
              return count;
              else 
              { if(sentence.indexOf(' ')+searchWord.length()>sentence.length()-1) 
                    return -1;  
                sub=sentence.substring(sentence.indexOf(' ')+1,sentence.indexOf(' ')+searchWord.length()+1);
                sentence=sentence.replaceFirst(" ","");
                 count++;
              }
             
          }
             return -1;
    }
}