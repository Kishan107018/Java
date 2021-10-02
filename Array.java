import java.util.Scanner;

public class Array {

  public static void main(String [] args)
    {
         Scanner s=new Scanner(System.in);
         System.out.print("Enter the Size : ");
        int size=s.nextInt();
                  
        int arr[]=new int[size];
         
         System.out.println("Enter the array value:");
         
        //Take user input
        for(int i=0;i<size;i++)
        {
        arr[i]=s.nextInt();
        }
        
        for(int i=0;i<size;i++)
         {
          System.out.print(arr[i]+" ");
        } 

    }
}
