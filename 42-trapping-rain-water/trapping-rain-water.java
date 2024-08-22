class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        for (int i = 0 ; i < height.length ; i++){
            if (i == 0 ){
                left[i] = height[i];
            }
            else{
                left[i] = Math.max(left[i-1] , height[i]);
            }
        }
        int right[] = new int[height.length];
        for (int j = height.length - 1  ; j >=0 ; j-- ){
            if(j == height.length -1){
                right[j] = height[j];
            }else{
                right[j] = Math.max(right[j+1] , height [j]);
            }
        }    
    int sum = 0 ;
    for (int i = 0 ; i < height.length ; i++){
        int water = Math.min(left[i] , right[i]);
        int level = water - height[i];
        sum +=level;
    }
    return sum;    
    }
}