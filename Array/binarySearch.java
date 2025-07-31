public class binarySearch {

    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length -1;

        while (start <= end) {
            int mid = (start + end )/2;  //calculate mid

            //comparision
            if (numbers[mid]==key) {  //found value at mid
                return mid;
            }
            if (numbers[mid]<key) { //right side
                start = mid+1;
            }else{//left side
                end = mid -1;
            }
           
        }
       
        return -1;
    }
    public static void main(String[] args) {
        

        int numbers[] = {12,13,14,15,16,17,18};  //array size
        int key = 16;

        System.out.println("fount at position :"+BinarySearch(numbers, key));//funcion call
            
        }
    }

