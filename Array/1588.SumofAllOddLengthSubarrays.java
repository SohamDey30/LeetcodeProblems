class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n = arr.length;
   for(int i=0;i<arr.length;i++){
        int left = i+1;
        int right = n-i; // (n-1)-i+1
        int total = left * right;
        sum = sum + ((total+1)/2*arr[i]);
    }
        return sum;
    }
}
