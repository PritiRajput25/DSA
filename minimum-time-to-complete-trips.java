class Solution {
    public long minimumTime(int[] time, int totalTrips) {
    long s=1;
    long e=0;
    long min=Long.MAX_VALUE;
    for(int n:time){
        min=Math.min(min,n);
    } 
    e=min*totalTrips;
    long ans=-1;
    while(s<=e){
        long mid=s+(e-s)/2;
        long timereq=mid;
        long trips=0;
        for(int i=0;i<time.length;i++){
            trips+=timereq/time[i];
        }
        if(trips>=totalTrips){
            ans=mid;
            e=mid-1;
        }
        else s=mid+1;
    }
    return ans;   
    }
}