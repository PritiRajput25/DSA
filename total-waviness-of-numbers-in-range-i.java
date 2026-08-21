class Solution {

    public int totalWaviness(int num1, int num2) {
        int waviness=0;
        for(int j=num1;j<=num2;j++){
                String s=Integer.toString(j);
                int n=s.length();
     for(int i=1;i<n-1;i++){
        if((s.charAt(i)-'0')>(s.charAt(i-1)-'0') && (s.charAt(i)-'0')>(s.charAt(i+1)-'0')) waviness++;
        else if((s.charAt(i)-'0')<(s.charAt(i-1)-'0') && (s.charAt(i)-'0')<(s.charAt(i+1)-'0')) waviness++;
     } 
        }
        return waviness;
    }
}