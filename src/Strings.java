import java.util.HashMap;
import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        UserLogin();
    }


    //      IMPORTANT     //
    // Try implementing this with file system, i.e. creating a new file and saving the user data in there and then cross checking from there.
    // Maybe later try to implement this by integrating SQL
    public static void UserLogin()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            //Taking some usernames and saving them in a hash map.
            System.out.print("Let us first register some people. How many? ");
            int userCount = Integer.parseInt(sc.nextLine());
            
            HashMap<String, String> loginData = new HashMap<>();

            for(int i=0; i<userCount; i++)
            {
                System.out.print("Enter a username: ");
                String newUsernameCreated = sc.nextLine();
                System.out.print("Enter a password for this user: ");
                String newPasswordCreated = sc.nextLine();
                loginData.put(newUsernameCreated, newPasswordCreated);
            }
            
            System.out.println("\nLoading login system...\n");

            //  Login System    //
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            
            if(password.equals(loginData.get(username)))
                System.out.println("You have successfully logged in!");
            else
                System.out.println("Incorrect Password");
        }
    }


    public static void StringSplitting()    //Split on blank spaces but only prints words that have "av" in them
    {
        try (Scanner sc = new Scanner(System.in))
        {
            String s = sc.nextLine();
            
            String[] sSplit = s.split(" ");
            
            for(String word : sSplit)
            {
                if(word.contains("av"))
                    System.out.println(word);
            }
        }
    }
}