class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
     HashMap<Integer,List<Integer>> map=new HashMap<>();
    List<List<Integer>> result=new ArrayList<>(); 
  for(int i=0;i<groupSizes.length;i++){
    int size=groupSizes[i];
    map.putIfAbsent(size,new ArrayList<>());
    List<Integer> currentGroup=map.get(size);
   currentGroup.add(i);
   if(currentGroup.size()==size){
    result.add(new ArrayList<>(currentGroup));
    currentGroup.clear();
   } 
  }
 return result;
    }
}