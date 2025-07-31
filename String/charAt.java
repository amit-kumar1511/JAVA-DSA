public class charAt {

    public static void printLatter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        String fullname = "amit kumar sharma";
        //System.out.println(fullname.charAt(0));
        //System.out.println(fullname.charAt(2));

        printLatter(fullname);
    }
}
