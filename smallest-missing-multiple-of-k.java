class Solution {
    public int missingMultiple(int[] nums, int k) {
    HashSet<Integer> set=new HashSet<>();
    int n=nums.length;
    for(int i=0;i<n;i++){
        set.add(nums[i]);
    } 
    int m=k*(n+1);
    int i=k;
    while(i<=m){
        if(!set.contains(i)) return i;
        i+=k;
    }
    return -1;
    }
}