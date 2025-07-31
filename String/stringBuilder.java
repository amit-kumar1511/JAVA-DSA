public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
        sb.append(ch);  //append means ek ke baad ek jodna

        }
        System.out.println(sb);

    }
}
