class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    HashMap<Character,Integer> map1=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();
    int n=s.length();
    int k=p.length();
    
    for(int i=0;i<k;i++){
  map2.put(p.charAt(i),map2.getOrDefault(p.charAt(i),0)+1);
    }
    List<Integer> ans=new ArrayList<>();
    if(n<k) return ans;
    for(int i=0;i<k;i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
    }
    if(map1.equals(map2)) ans.add(0);
    for(int i=k;i<s.length();i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        if(map1.get(s.charAt(i-k))==1) map1.remove(s.charAt(i-k));
       else  map1.put(s.charAt(i-k),map1.get(s.charAt(i-k))-1);
       if(map1.equals(map2)) ans.add(i-k+1);
    }
    return ans;   
    }
}