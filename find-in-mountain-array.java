/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
     int s=0;
     int e=mountainArr.length()-1;
     while(s<e){
        int mid=s+(e-s)/2;
        if(mountainArr.get(mid)<mountainArr.get(mid+1)) s=mid+1;
        else e=mid;
     } 
     e=s;
     int start=s+1;
     int end=mountainArr.length()-1;
     int ans2=Integer.MAX_VALUE;
     s=0;
     int ans1=Integer.MAX_VALUE;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(mountainArr.get(mid)==target){
            ans1=mid;
            break;
        }
        else if(mountainArr.get(mid)<target) s=mid+1;
        else e=mid-1;
    }
    while(start<=end){
        int mid=start+(end-start)/2;
        if(mountainArr.get(mid)==target){
            ans2=mid;
            break;
        }
        else if(mountainArr.get(mid)>target) start=mid+1;
        else end=mid-1;
    }
    if(ans1==Integer.MAX_VALUE && ans2==Integer.MAX_VALUE) return -1;
    return Math.min(ans1,ans2);
    }
}