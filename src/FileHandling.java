import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandling
{
    public static void main(String[] args)
    {
        Cubes();
    }
    
    
    public static void Cubes()
    {
        try( Scanner sc = new Scanner(Paths.get("../res/Numbers.txt")))
        {
            while (sc.hasNextLine())
            {
                int num = Integer.parseInt(sc.nextLine());
                System.out.println(num * num * num);
            }
        } catch (IOException ex)
        {
            System.out.println("Error: " + ex);
        }
    }
}