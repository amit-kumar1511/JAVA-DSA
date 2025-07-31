public class typeCasting {
    public static void main(String[] args) {

        float a = 29.9999f;  
        int b = (int) a;      // 0.9999 data is loss becuse that is use to lossy conversion
        System.out.println(b);   //print 29
    }
}
