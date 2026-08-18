class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> map1=new HashMap<>();
    HashMap<Integer,Integer> map2=new HashMap<>();
    List<Integer> list1=new ArrayList<>(); 
    List<Integer> list2=new ArrayList<>(); 
    for(int i=0;i<nums2.length;i++){
        map1.put(nums2[i],1);
    } 
    for(int i=0;i<nums1.length;i++){
        if(map1.getOrDefault(nums1[i],0)==0) {
            list1.add(nums1[i]);
            map1.put(nums1[i],1);
        }
        
    } 
    for(int i=0;i<nums1.length;i++){
map2.put(nums1[i],1);        
    } 
     for(int i=0;i<nums2.length;i++){
        if(map2.getOrDefault(nums2[i],0)==0) {
            list2.add(nums2[i]);
            map2.put(nums2[i],1);
        }
    } 
    return Arrays.asList(list1,list2); 
    }
}