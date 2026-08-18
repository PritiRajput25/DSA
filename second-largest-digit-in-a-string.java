class Solution {
    int max=-1;
    int smax=-1;
    public int secondHighest(String s) {
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isDigit(c)){
            int n=(int)(c-'0');
            if(n>max){
                smax=max;
                max=n;
            }
            else if(n>smax && n!=max){
                smax=n;
            }
        }
     }
     return smax;   
    }
}