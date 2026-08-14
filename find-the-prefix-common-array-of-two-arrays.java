class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
     HashMap<Integer,Integer> map=new HashMap<>();
     
     int[] res=new int[A.length];
     for(int i=0;i<A.length;i++){
        int count=0;
        map.put(A[i],map.getOrDefault(A[i],0)+1);
        for(int j=0;j<=i;j++){
          count+=map.getOrDefault(B[j],0);
        }
        res[i]=count;
     } 
     return res;  
    }
}