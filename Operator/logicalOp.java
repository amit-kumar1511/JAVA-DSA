public class logicalOp {
    public static void main(String[] args) {
        
        //logical AND
        System.out.println((10>7) && (1<4));  //dono satement true rhega tbhi result true hoga otherwise false
        System.out.println((10>7) && (10<4));

        //logical OR
        System.out.println((10>4) || (10>1));   //dono satement false rhega tbhi result false hoga otherwise true
        System.out.println((1>4) || (10<1));

        //logic NOT
        System.out.println(!(10>4));  //dono satement false rhega tbhi result false hoga otherwise true
    }
}
