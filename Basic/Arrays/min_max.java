import java.util.Scanner;

public class min_max {
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

        int max=array[0];
        int min=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("max value is:"+max);
        System.out.println("min value is :"+min);
    }
}
