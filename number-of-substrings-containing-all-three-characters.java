class Solution {
    public int numberOfSubstrings(String s) {
    int r=0;
    int l=0;
    int ans=0;
    int n=s.length();
    int[] map=new int[3];
    while(r<n){
        map[s.charAt(r)-'a']++;
        while(map[0]>0 && map[1]>0 && map[2]>0){
            ans+=n-r;
            map[s.charAt(l)-'a']--;
            l++;
        }
        r++;
    } 
    return ans;   
    }
}