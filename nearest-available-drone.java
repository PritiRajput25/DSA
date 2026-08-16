class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
      int index=-1;
        int tar=Integer.MAX_VALUE;
        int n=drones.length;
        for(int i=0;i<n;i++){
            int currtar=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(currtar<=drones[i][2]){
              if(tar>currtar){
                  tar=currtar;
                  index=i;
              }  
            }
        }
        return index;
    }
}