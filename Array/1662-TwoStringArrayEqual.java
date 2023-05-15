class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String attach1="",attach2="";
        for(int i=0;i<word1.length;i++){
             attach1 += word1[i];
        }
        for(int j=0;j<word2.length;j++){
             attach2 += word2[j];
        }
        return attach1.equals(attach2);       
    }
}