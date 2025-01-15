import java.util.Scanner;

public class ChristmasTree
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter size of triangle: ");
            int leafSize = Integer.parseInt(sc.nextLine());
            
            for(int i=1; i<=leafSize; i++)
            {    
                //  LEAVES  //
                for(int j=leafSize; j>=i; j--)
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

            //  BARK    //
            int barkSize = leafSize/4;
            for (int i=1; i<=barkSize; i++)
            {
                for(int j=1; j<=leafSize-barkSize; j++)
                    System.out.print(" ");
            
                for(int k=1; k<=barkSize+1; k++)
                    System.out.print("*");
            
                System.out.println();
            }
        }
    }
}