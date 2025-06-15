public class constructorOverloading {
    public static void main(String[] args) {
        book b1=new book();
        book b2=new book("S.JayaShankar");
        book b3= new book("Abc",2018);
        book b4=new book("M. Mohan",2023,312);
        b1.display();
        b2.display();
        b3.display();;
        b4.display();
    }
}

class book{
    String author;
    int publishYear;
    int price;
    
    book(){
        this.author="Unknown";
        this.publishYear=0;
        this.price=0;
    }

    book(String Author){
        this.author=Author;
    }
    
    book(String Author, int PublishYear){
        this.author=Author;
        this.publishYear=PublishYear;
    }

    book(String Author, int PublishYear,int Price){
        this.author=Author;
        this.publishYear=PublishYear;
        this.price=Price;
    }

    void display(){
        System.out.println("Author is:"+ author + " publish Year : "+publishYear+" price: "+price);
    }
}
