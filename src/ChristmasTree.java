import java.util.Scanner;

public class ChristmasTree
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter size of triangle: ");
            int size = Integer.parseInt(sc.nextLine());
            
            for(int i=1; i<=size; i++)
            {    
                //Leaves
                for(int j=size; j>=i; j--)
                {    
                    if (j==i)
                    {   
                        //Left triangle
                        for(int k=1; k<=j; k++)
                            System.out.print("*");

                        //Right triangle
                        for(int x=1; x<=j-1; x++)
                            System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            
                //Next Line
                System.out.println();
            }

            //Bark
            for (int i=1; i<=2; i++)
            {
                for(int j=1; j<=size-2; j++)
                    System.out.print(" ");
            
                for(int k=1; k<=3; k++)
                    System.out.print("*");
            
                System.out.println();
            }
        }
    }
}