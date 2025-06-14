import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();

        int array[]=new int[size];
        System.out.println("enter the element of array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }  
        
        System.out.println("your Array is:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
        }
        System.out.print("reversed array is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
