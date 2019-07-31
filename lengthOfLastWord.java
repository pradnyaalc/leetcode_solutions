class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().length()>0){
           String[] token = s.split(" ");
        return token[token.length-1].length(); 
        }
       return 0;
    }
}
