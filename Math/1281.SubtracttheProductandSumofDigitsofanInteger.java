class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int mul=1;
        while(n!=0){
            int c = n%10;
            mul *= c;
            sum += c;
            n = n/10;
        }
        return mul-sum;
    }
}