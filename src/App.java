import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        
    }
    
    
    private static void ItemsRunMethod()
    {
        ArrayList<Items> items = new ArrayList<>();
    
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter an item name, empty will end: ");
            String itemName = sc.nextLine();
    
            while(!itemName.equals(""))
            {
                Items item = new Items(itemName);
                items.add(item);
                System.out.print("Enter an item name, empty will end: ");
                itemName = sc.nextLine();
            }
    
            for(int i=0; i<items.size(); i++)
            {
                System.out.println(items.get(i));
            }
        }
    }


    private static void PaymentSystem()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            //Initialize card and Terminal
            System.out.print("Enter payment card balance: ");
            PaymentCard myCard = new PaymentCard(Double.parseDouble(sc.nextLine()));

            PaymentTerminal mess = new PaymentTerminal(myCard);
            mess.BuyAffordableMeal(myCard);
            mess.BuyAffordableMeal(myCard);
            mess.BuyAffordableMeal(myCard);
            mess.BuyAffordableMeal(myCard);
            mess.BuyAffordableMeal(myCard);

            System.out.print("Add more money to your card: ");
            myCard.AddMoney(Double.parseDouble(sc.nextLine()));
            
            mess.BuyHeartyMeal(myCard);
            mess.BuyHeartyMeal(myCard);
            mess.BuyHeartyMeal(myCard);        

            System.out.println(mess);
        }
    }


    //int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    //System.out.println(BinarySearch(nums, 0));
    private static int BinarySearch(int[] arr, int x)
    {
        int l = 0, h = arr.length - 1;

        while(l <= h)
        {
            int mid = (l + h) /2;

            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                h = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }
}