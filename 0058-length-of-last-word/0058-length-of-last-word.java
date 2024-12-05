class Solution {
    public int lengthOfLastWord(String s) {
          s=s.trim();
        String sub= s.substring(s.lastIndexOf(" ")+1,s.length());
        return sub.length();
    }
}