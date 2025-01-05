import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists
{
    public static void main(String[] args)
    {
        AvgOfList();
    }


    public static void FirstAndLastNameInList()
    {
        ArrayList<String> names = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in))
        {
            //Inputting the first name
            names.add(sc.nextLine());
            int i=0;

            //Inputting the rest of the names
            while (!names.get(i).equals(""))
            { 
                names.add(sc.nextLine());
                i++;
            }

            //Printing the first & the last names
            System.out.println(names.get(0));
            System.out.println(names.get(i-1));
        }
        
    }


    public static void LargestOfList()
    {
        ArrayList<String> nums = new ArrayList<>();
        
        try (Scanner sc = new Scanner(System.in))
        {
            //Inputting the first input & setting it as the largest
            nums.add(sc.nextLine());
            int i=0;
            int largest = Integer.parseInt(nums.get(i));

            //Inputting the rest of the numbers
            while(!nums.get(i).equals(""))
            {
                i++;
                nums.add(sc.nextLine());
            }
            
            //Finding the Largest
            for(int j=1; j<nums.size()-1; j++)
            {
                if(Integer.parseInt(nums.get(j)) > largest)
                    largest = Integer.parseInt(nums.get(j));
            }
            
            System.out.println(largest);
        }
    }


    public static void FindNumberInList()
    {
        ArrayList<String> nums = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in))
        {
            //Inputting the first number
            nums.add(sc.nextLine());
            int i=0;
            
            //Inputting the rest of the numbers
            while(!nums.get(i).equals(""))
            {
                i++;
                nums.add(sc.nextLine());
            }
            
            //Asking & printing the index of the number in question
            System.out.println("Enter which no.'s index you want?");
            String x = sc.nextLine();
            if(nums.contains(x))
                System.out.println("Index of " + x + " is " + nums.indexOf(x));
        }
    }


    //Unlike the rest, this method's termination happens when -1 is entered.
    public static void AvgOfList()
    {
        ArrayList<Integer> nums = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in))
        {
            //Inputting the first integer
            int x = Integer.parseInt(sc.nextLine());

            //Given the integer isn't -1, adding it to the list and inputting more
            while (x != -1)
            { 
                nums.add(x);    
                x = Integer.parseInt(sc.nextLine());
            }

            //Calculating & printing the average (with error handling)
            if (nums.isEmpty())
                System.out.println("Try again with a valid number");
            else
            {
                int sum = 0;
                for (int i=0; i<nums.size(); i++)
                    sum += nums.get(i);
        
                System.out.println("\n" + sum/nums.size());
            }
                
        }
    }
}