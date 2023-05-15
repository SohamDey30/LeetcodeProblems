class Solution {
    public String truncateSentence(String s, int k) {
        int wordCount=0;
        String newSentence = s;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                wordCount++;
                if(wordCount == k){
                  newSentence =s.substring(0,i);
                }
            }
        }
        return newSentence;
    }
}