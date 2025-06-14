public class getter_setter{
    public static void main(String[] args) {

        //student class accessbility

        student s1=new student();
        s1.setId(101);
        s1.setName("xyz");
        s1.setAge(14);
        System.out.println("id is :"+s1.getId());
        System.out.println("name is :"+s1.getName());
        System.out.println("age is :"+s1.getAge());



        //bank class accessbility
        bankAccount b1=new bankAccount();
        System.out.println("your account no is: "+b1.getAccount_Number());
    }
}


//read and write the private access data using getter and setter
class student{
    private int id;
    private String name;
    private int age;

    public int getId(){
        return id;
    }

    public void setId(int Id){
        this.id=Id;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name=Name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int Age){
        this.age=Age;
    }

}


//only see the data but can't change the data 

class bankAccount{
    private final int accontNumber=1234567890;

    public int getAccount_Number(){
        return accontNumber;
    }
}


//Getters: Methods that return the value of a private field. eg:getName()
// Setters: Methods that set/update the value of a private field. eg:setName()