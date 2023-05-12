class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int totalTime = arrivalTime+delayedTime;
        
        return totalTime%24;
        
    }
}