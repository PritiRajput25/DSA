class Solution {
    public int maxArea(int[] height) {
        int area=0;
     int n=height.length;
     int left=0;
     int right=n-1;
     while(left<right){
       int width=right-left;
       int h=Math.min(height[left],height[right]);
        int A=width*h;
        area=Math.max(area,A);
        if(height[left]<height[right]) left++; //height to smaller wale se hi neklegi
        else right--;  // to agr left wala chhota h to right wale ko aage badhane se koi mtlb nhi kyuki height leftwale ki hi mani jayegi
         }   
         return area;
    }
}