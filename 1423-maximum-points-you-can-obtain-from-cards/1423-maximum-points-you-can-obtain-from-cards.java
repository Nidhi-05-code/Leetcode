class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total += cardPoints[i];
        }
        int windowSize = n - k;

        int windowSum = 0;
        int minSum = Integer.MAX_VALUE; 
        for( int i=0;i<windowSize;i++){
            windowSum +=cardPoints[i];
        }
        minSum = windowSum;
        for(int i=windowSize;i<n;i++){
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i-windowSize];
            minSum = Math.min(minSum,windowSum);
        }
        return total-minSum;
    }   
}