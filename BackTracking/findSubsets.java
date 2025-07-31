public class findSubsets {
    public static void PrintSet(String str , String ans , int i){
        //base case
        if(i == str.length()){
            System.err.println(ans); // print the current subset
            return;
        }

        //recursion(kaam) yes choice
       PrintSet(str, ans + str.charAt(i), i+1); // include the current character in the subset
        //no choice (backtracking)
        PrintSet(str, ans, i+1); // move to the next character without including it
    }
    public static void main(String[] args) {
        String str = "abc"; // input string
        PrintSet(str, "", 0); 
    }
}
