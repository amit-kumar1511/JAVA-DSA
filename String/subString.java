public class subString {

    public static String abc(String str, int si, int ei){
        String substr = "";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
return substr;
    }
    public static void main(String[] args) {

        String str = "HELLOWORLD";
        //System.out.println(str.substring(0,5));  // java ke ander substring fun phele se exist krta he

        abc(str, 0, 5);
    }
}





