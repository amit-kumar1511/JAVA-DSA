public class SetGet {
    public static void main(String[] args) {

        Pen obj = new Pen();

        obj.setColor("red");
        System.out.println(obj.getColor());

        obj.setTip(5);
        System.out.println(obj.getTip());

        obj.setColor("yellow");
        System.out.println(obj.getColor());
        
    }
}


class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
