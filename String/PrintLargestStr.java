public class PrintLargestStr {
    public static void main(String[] args) {
        
        String fruit[] = {"apple" , "mango" , "banana"};  //take 3 string

        String largest = fruit[0];   //mana phele bala hi string largest he

        for(int i=0; i<fruit.length; i++){   //all string ko travel kya
            if(largest.compareTo(fruit[i]) < 0){   // fir comaprision fun use kya <0 hoto largest fruit aa jayega 
                largest = fruit[i];   // fruit i ko largest ke andar stoe kr denge
            }
        }
        System.out.println(largest);   // fir largest ko print kr denge
    }
}
