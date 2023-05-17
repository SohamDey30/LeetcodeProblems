class Solution {
    public int smallestEvenMultiple(int n) {
        int i = 1;
        while(n>0){

          if(i%n==0 && i%2 ==0){
               break;
            }
            i++;
        }
        return i;
    }
}