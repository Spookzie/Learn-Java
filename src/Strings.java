import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        StringSplitting();
    }


    //      IMPORTANT     //
    // Once dictionary/maps have been studied modify this code to work like actual login window
    // Maybe later also try to implement SQL in this
    public static void UserLogin()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            //Inputting the username
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            
            //Inputting and checking the password
            if(username.equals("vansh") || username.equals("shivam"))
            {
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                
                if(password.equals("joker") || password.equals("queen"))
                    System.out.println("\nYou have successfully logged in!");
                else
                    System.out.println("\nIncorrect Password!");
            }
            else
                System.out.println("\nUser '" + username + "' not found :(");
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