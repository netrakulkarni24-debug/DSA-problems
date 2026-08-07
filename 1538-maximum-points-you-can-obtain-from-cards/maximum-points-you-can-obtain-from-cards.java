class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        // Take first k cards
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        maxSum = leftSum;

        int rightIndex = cardPoints.length - 1;

        // Replace one left card with one right card
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum;
    }
}