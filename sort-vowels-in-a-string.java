class Solution {
     public boolean isVowel(char c){
        if(c=='A' || c=='E' || c=='I' ||  c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
    public String sortVowels(String s) {
        char[] ch=s.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
    for(char c:ch){
        if(isVowel(c))list.add(c);
    }
    Collections.sort(list);
    int ind=0;
    for(int i=0;i<ch.length;i++){
        if(isVowel(ch[i])){
            ch[i]=list.get(ind);
            ind++;
        }
    } 
    return new String(ch);   
    }
}