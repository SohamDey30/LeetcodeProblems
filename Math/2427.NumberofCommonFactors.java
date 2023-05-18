class Solution {
    public int commonFactors(int a, int b) {
        int i = 1;
        int count=0;
        while(i<=Math.min(a,b)){
            if(a % i == 0 && b % i == 0){
                count++;   
            }
            i++;
        } 
        return count;
        
    }
}