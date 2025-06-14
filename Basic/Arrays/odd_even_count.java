import java.util.*;
public class odd_even_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of array with mixed of odd and even");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int oddCount=0;
        int evenCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("total even no in array is :"+evenCount);
        System.out.println("total odd no in array is :"+oddCount);
    }
}
