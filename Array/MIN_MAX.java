class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        long min = Integer.MAX_VALUE; // Corrected to long
        int max = Integer.MIN_VALUE; // Corrected to Integer.MIN_VALUE

        for(int i=0; i<arr.length;i++){
            if (arr[i] > max) { // Corrected to compare arr[i] with max
                max= arr[i];
            }
            if (arr[i]<min) {
               min = arr[i]; 
            }
        }
        System.out.println("min value is "+min + "\n maximum value is :"+max);
    }
pair p = new pair (max,min);
return p;
