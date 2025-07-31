public class ConvertUpperCase {

    public static String FindUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));  //1st latter uppercase krne ke lye
        sb.append(ch);

        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i)  == ' ' && i < str.length()-1) {  //check condition to find space 
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "i am amit kumar";

    }
}
