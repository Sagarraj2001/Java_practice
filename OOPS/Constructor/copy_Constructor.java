public class copy_Constructor{
    public static void main(String[] args) {
        college c1=new college("IT",2022); //original Constructor
        college c2=new college(c1); //copy Constructor
        c1.display();
        c2.display();
    }
}

class college{
    String dept;
    int stdCount;

    college(String Dept, int StdCount){
        this.dept=Dept;
        this.stdCount=StdCount;
    }

    college(college coll){
        this.dept=coll.dept;
        this.stdCount=coll.stdCount;
    }

    void display(){
        System.out.println("Department is :"+ dept+ " and Student Count is : "+stdCount);
    }
}