class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
        }
        int ans=0;
        while(k>0){
            ans = ans + max;
            max = max+1;
            k--;
        }
        return ans;
    }
}
