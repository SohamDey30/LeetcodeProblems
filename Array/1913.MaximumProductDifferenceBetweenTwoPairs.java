class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);

       //select first 2 element
           int first2= nums[0]*nums[1];
       //select last 2 element 
            int last2=nums[nums.length-1]*nums[nums.length-2];

            return last2-first2;
    }
}