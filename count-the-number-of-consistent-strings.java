class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    int len=allowed.length();
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<len;i++){
        set.add(allowed.charAt(i));
    }
    int count=0;
    for(int i=0;i<words.length;i++){
        
       for(int j=0;j<words[i].length();j++){
        if(!set.contains(words[i].charAt(j))) break;
        if(j==words[i].length()-1) count++;
       }
       
    } 
    return count;   
    }
}