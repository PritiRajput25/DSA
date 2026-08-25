class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
     int length1=Math.max(ax1,ax2)-Math.min(ax1,ax2);
     int breadth1= Math.max(ay1,ay2)-Math.min(ay1,ay2); 
     int area1=length1*breadth1; 
     int length2=Math.max(bx1,bx2)-Math.min(bx1,bx2);
     int breadth2= Math.max(by1,by2)-Math.min(by1,by2); 
     int area2=length2*breadth2;
     int overlapl = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlapb = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
     return area1+area2 -overlapl*overlapb;
    }
}