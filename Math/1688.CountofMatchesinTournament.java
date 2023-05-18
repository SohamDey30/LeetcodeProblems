class Solution {
    public int numberOfMatches(int n) {
        int count=0;

        while(n>1){
            if(n%2==0){
                int matches = n/2;
                count = count + matches;
                int teams = n/2;
                n = teams;
            }
            else{
                int matches = (n-1)/2;
                count = count + matches;
                int teams  = (n-1)/ 2+1;
                n = teams;
            }
        }
        return count;
    }
}