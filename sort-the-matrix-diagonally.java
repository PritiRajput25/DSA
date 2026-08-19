class Solution {
    public int[][] diagonalSort(int[][] mat) {
     HashMap<Integer,List<Integer>> map=new HashMap<>();
     for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            map.putIfAbsent(i-j,new ArrayList<>());
            map.get(i-j).add(mat[i][j]);
        }
     } 
     for(List<Integer> li:map.values()){
        Collections.sort(li);
     }
     HashMap<Integer,Integer> indexmap=new HashMap<>();
     for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            int key=i-j;
            int ind=indexmap.getOrDefault(key,0);
            mat[i][j]=map.get(key).get(ind);
            indexmap.put(key,ind+1);
        }
     }
     return mat;
    }
}