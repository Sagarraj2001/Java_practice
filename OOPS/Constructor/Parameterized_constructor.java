public class Parameterized_constructor{
    public static void main(String[] args) {
        car c1=new car("BMW","Red");
        c1.dissplay();
    }
}


class car{
    String name;
    String color;
    car(String Name,String Color){
        this.name=Name;
        this.color=Color;
    }

    void dissplay(){
        System.out.println("Car Name is:"+name);
        System.out.println("Color is :"+color);
    }
}