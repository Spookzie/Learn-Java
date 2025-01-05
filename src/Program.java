import java.util.ArrayList;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        ChristmasTree();
    }
    
    
    public static void ChristmasTree()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of triangle: ");
        int size = sc.nextInt();
        System.out.println();
        
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


    public static void FirstAndLastNameInList()
    {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        names.add(sc.nextLine());

        int i=0;
        while (true)
        { 
            if(names.get(i).equals(""))
            {
                System.out.println(names.get(0));
                System.out.println(names.get(i-1));
                break;
            }
            else
            {
                names.add(sc.nextLine());
            }

            i++;
        }
    }


    public static void LargestOfList()
    {
        ArrayList<String> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        nums.add(sc.nextLine());

        int i=0;
        int largest = Integer.valueOf(nums.get(i));
        while(true)
        {
            if((nums.get(i) == "\n") || (nums.get(i) == "") || (nums.get(i) == " "))
            {
                for(int j=1; j<nums.size(); j++)
                {
                    if(Integer.valueOf(nums.get(j)) > largest)
                        System.out.println(nums.get(j));
                    else
                        System.out.println(largest);

                    break;
                }
                break;
            }
            else
                nums.add(sc.nextLine());

            i++;
        }
    }


    public static void FindNumberInList()
    {
        ArrayList<String> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        nums.add(sc.nextLine());

        int i=0;
        while(true)
        {
            if((nums.get(i) == "\n") || (nums.get(i) == "") || (nums.get(i) == " "))
                break;
            else
                nums.add(sc.nextLine());

            i++;
        }

        System.out.println("Enter which no.'s index you want?");
        String x = sc.nextLine();
        
        if(nums.contains(x))
            System.out.println("Index of " + x + " is " + nums.indexOf(x));
    }


    public static void AvgOfList()
    {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true)
        { 
            int x = Integer.valueOf(sc.nextLine());
            if(x == -1)
            {   
                int sum = 0;
                for (int i=0; i<nums.size(); i++)
                    sum += nums.get(i);

                System.out.println("\n" + sum/nums.size());

                break;
            }
            else
                nums.add(x);
        }
    }


    //      IMPORTANT     //
    //Once dictionary/maps have been studied modify this code to work like actual login window
    public static void UserLogin()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if(username.equals("vansh") || username.equals("shivam"))
        {
            if(password.equals("joker") || password.equals("queen"))
                System.out.println("You have successfully logged in!");
            else
                System.out.println("Incorrect Password!");
        }
        else
            System.out.println("Incorrect Username!");
    }


    public static void StringSplitting()    //Split on blank spaces but only prints words that have "av" in them
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        while(!s.equals(""))
        {
            String[] sSplit = s.split(" ");

            for(String word : sSplit)
            {
                if(word.contains("av"))
                    System.out.println(word);
            }
            
            s = sc.nextLine();
        }
    }
}