class Solution {
    public int[] shuffle(int[] nums, int n) { 
        int len=2*n,i=0;
        int[] ans = new int[len];
        int x=0,y=n;
        while(i<len){
            ans[i++]=nums[x++];
            ans[i++]=nums[y++];
        }
        return ans;
    }
}