class Solution {
    public List<List<Integer>> findWinners(int[][] matches) { 
        
     HashMap<Integer,Integer> loser=new HashMap<>();
     List<Integer> count0=new ArrayList<>();
     List<Integer> count1=new ArrayList<>();
     int n=matches.length;
     int m=matches[0].length;
     for(int i=0;i<n;i++){
            loser.put(matches[i][1],loser.getOrDefault(matches[i][1],0)+1);
            loser.putIfAbsent(matches[i][0],0);
     } 
     for(int key:loser.keySet()){
        if(loser.get(key)==0) count0.add(key);
        else if(loser.get(key)==1) count1.add(key);
     }
    
     List<List<Integer>> ans=new ArrayList<>();
        Collections.sort(count0);
        Collections.sort(count1);
     ans.add(count0);
     ans.add(count1);
     return ans;
    }
}