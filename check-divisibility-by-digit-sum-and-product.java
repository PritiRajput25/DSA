class Solution {
    public boolean checkDivisibility(int n) {
    int sum=0;
    int temp=n;
    int product=1;
    while(temp!=0){
        sum+=temp%10;
        product*=temp%10;
        temp/=10;
    }  
    return n%(sum+product)==0;  
    }
}