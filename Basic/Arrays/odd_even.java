import java.util.Scanner;

public class odd_even {
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

        int evenCount=0;
        int oddCount=0;
        System.out.print("your even no is:");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.print("your odd no is :");
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");
                oddCount++;
            }
        }
    }
}
