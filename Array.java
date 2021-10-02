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
         
     for(int i=0;i<size-1;i++)
         {
          for(int j=0;j<size-1;j++)
              {
                 if(arr[j]<arr[j+1])
                  {
                     int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                 }
               }
         }
         
    System.out.println("The sorted output");
        //to print the sorted array
        for(int i=0;i<size;i++)
         {
          System.out.print(arr[i]+" ");
        } 

    }
}