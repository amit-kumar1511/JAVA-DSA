public class Inter_face {
    public static void main(String[] args) {

        Queen q = new Queen();
        q.move();

        // muliplke inheritance obj
        bear b = new bear();
        b.eatGrass();
        b.eatMeet();
        
    }
}

interface CheesPly {
    void move();        //function
}


//interface impliment in class
class Queen implements CheesPly{
    public void move(){
        System.out.println("left,right,top,bottom,digonal");
    }
}

class king implements CheesPly{
    public void move(){
        System.out.println("left,right,top,bottom,digonal");
    }
}

class Rook implements CheesPly{
    public void move(){
        System.out.println("left,right,top,bottom");
    }
}


// in interface use to multiple inheritance

interface Herbivore{
     void eatGrass();
}
interface Carnivore{
 void eatMeet();
}

class bear implements Herbivore , Carnivore{
    public void eatGrass (){
        System.out.println("eat grass ");
    }

    public void eatMeet(){
        System.out.println("eat meet");
    }
}


