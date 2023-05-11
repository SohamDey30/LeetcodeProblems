class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            while(nums[j]>0){
            int k = nums[j] % 10;
            sum1+= k;
            nums[j]=nums[j]/10;
            }
        }
       int sum2 = sum-sum1;
       if(sum2<=0){
           sum2 = -sum2;
       }
       return sum2;
    }
}