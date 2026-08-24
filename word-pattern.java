class Solution {
    public boolean wordPattern(String pattern, String s) {
     String[] words=s.split(" "); 
     if(pattern.length()!=words.length) return false;
     HashMap<Character,String> map=new HashMap<>();
     
     for(int i=0;i<pattern.length();i++){
        char c=pattern.charAt(i);
       if(map.containsKey(c) && !map.get(c).equals(words[i])) return false;
       if(!map.containsKey(c) && map.containsValue(words[i])) return false;
       map.put(c,words[i]);
     }
     
     return true;
    }
}