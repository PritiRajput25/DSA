class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
     HashMap<String,Integer> map=new HashMap<>();
     int count=0;
     for(String s:words){
        String t=new StringBuilder(s).reverse().toString();
        if(map.getOrDefault(t,0)!=0){
      count++;
    map.remove(t);
        }
        else map.put(s,map.getOrDefault(s,0)+1);
     }
     return count;   
    }
}