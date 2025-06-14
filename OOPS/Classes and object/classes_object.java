public class classes_object {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        System.out.println("Id=" + e1.showId());
        System.out.println("Name=" + e1.showName());
        e1.id = 102;
        e1.name = "sidhart";
        System.out.println("Id=" + e1.showId());
        System.out.println("Name=" + e1.showName());
    }
}

class Emp {
    int id = 101;
    String name = "Abcd";

    int showId() {
        return id;
    }

    String showName() {
        return name;
    }
}
