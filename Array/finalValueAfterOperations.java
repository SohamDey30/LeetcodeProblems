class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        
        for(int i=0;i<operations.length;i++){
               switch(operations[i]){
                   case "X++": case "++X":
                       X=X+1;
                       break;
                   default:
                       X=X-1;
               }
        }
        return X; 
    }
}