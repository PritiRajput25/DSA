class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
     Arrays.sort(baskets);
     int count=0;
     for(int i=0;i<fruits.length;i++){
        int s=0;
        int e=baskets.length-1;
        int ans=-1;
        int target=fruits[i];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(baskets[i]>target){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        if(ans==-1) count++;
     }  
     return count-1; 
    }
}