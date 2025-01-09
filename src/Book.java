import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Book
{
    private static final String filePath = "../res/Books.txt";
    

    public static void GetBook()
    {
        try( Scanner sc = new Scanner(Paths.get(filePath)))
        {
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] details = line.split(", ");

                System.out.println(details[0]);
            }
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    
    public static void GetAuthor()
    {
        try( Scanner sc = new Scanner(Paths.get(filePath)))
        {
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] details = line.split(", ");

                System.out.println(details[1]);
            }
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        }
    }


    public static void GetPages()
    {
        try( Scanner sc = new Scanner(Paths.get(filePath)))
        {
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] details = line.split(", ");

                System.out.println(details[2]);
            }
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}