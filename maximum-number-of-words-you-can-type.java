class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String[] temp=text.split(" ");
    HashSet<Character> set=new HashSet<>();
    int count=temp.length;
    for(int i=0;i<brokenLetters.length();i++){
        set.add(brokenLetters.charAt(i));
    }
    for(String word:temp){
        for(int i=0;i<word.length();i++){
            if(set.contains(word.charAt(i))){
                count--;
                break;
            }
        }
    }
    return count;    
    }
}