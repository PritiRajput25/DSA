class Solution {
    int reverse(int n){
        int digit=0;
        while(n!=0){
            digit=digit*10+n%10;
            n/=10;
        }
        return digit;
    }
    public int sumOfPrimesInRange(int n) {
     int sum=0;
     int rev=reverse(n);
     int min=Math.min(n,rev);
     int max=Math.max(n,rev);
     for(int i=min;i<=max;i++){
        boolean flag=true;
        for(int div=2;div<i;div++){
            if(i%div==0){
                flag=false;
                break;
            }
        }
        if(flag){
            sum+=i;
        }
     }
     if(min==1) sum-=1;  
     return sum; 
    }
}