import java.util.*;

public class Count_capital {
    
 public static void main(String [] args)
 {
    int count=0;
    Scanner s=new Scanner(System.in);

    System.out.print("Enter the string : ");
    String str=s.nextLine();
 
    for(int i=0;i<str.length();i++)
    {
        if(Character.isUpperCase(str.charAt(i)))
        {
            count++;
        }
    }   

    System.out.println("Length of capital : "+ count);
 }

}