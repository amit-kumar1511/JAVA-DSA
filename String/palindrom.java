public class palindrom {
    public static boolean palindromString(String str){

        for(int i=0; i<str.length()/2; i++){  // divides in two part , given string
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)){  //comparision in two part string
                System.out.println("string is not palindrom");
                return false;
            }
        }

         System.out.println("given string is palindrom.");
        return true;
        
    }

    public static void main(String[] args) {
        String str = "racecar";
        palindromString(str);

    }
    
}
