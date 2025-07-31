//TRAPPING WATER ARRAY PROBLEM DSA SHEET QUESTION NO -22

public class trappingWaterQ {

    public static int TrappingWater(int height[]){
        int n = height.length;
        //calculate left max boundary - in array form
        int leftmax[] = new int [n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax [i] = Math.max(height[i], leftmax[i-1]);
        } 
        //calculate right max boundary - in array form
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1]; //last se start krne ke lye 
        for(int i=n-2; i>=0; i--){ //piche se calculate hoga
            rightmax [i] = Math.max(height[i], rightmax[i+1]);
        } 
        //loop
        int trapedWater =0;
        for(int i= 0; i<n; i++){
            //water level = min(left max boundary, right max boundary)
            int waterLavel = Math.min(leftmax[i], rightmax[i]);

            //traped water = water level - height[i]
            trapedWater += waterLavel - height[i]; //formula
            
        }
       
        return trapedWater;


    }
   public static void main(String[] args) {
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(TrappingWater(height));
   } 
}
