class Solution {
    public int rotatedDigits(int n) {
        int count=0;
    for(int i=2;i<=n;i++){
        boolean isValid=true;
        boolean changed=false ;
        int temp=i;
        while(temp!=0){
            int rem=temp%10;
            if(rem==3 || rem==4 || rem==7){
                isValid=false;
                break;
            }
            if(rem==2 || rem==5 || rem==6 || rem==9){
                changed=true;
            }
            temp/=10;
        }
        if(isValid && changed){
            count++;
        }
    } 
    return count;   
    }
}