class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String sentence : sentences){
            int len = sentence.split(" ").length;
            
            count = Math.max(count,len);
        
        }
        return count;
        
    }
}