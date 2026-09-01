class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n=cardPoints.length;
    
    int right=n-1;
    int count=0;
    int sum=0;
    int currsum=0;
    for(int i=0;i<k;i++){
        currsum+=cardPoints[i];
    }
    sum=Math.max(currsum,sum);
    for(int i=0;i<k;i++){
        currsum-=cardPoints[k-1-i];
        currsum+=cardPoints[right];
        right--;
        sum=Math.max(currsum,sum);
    }
    return sum;
    }
}