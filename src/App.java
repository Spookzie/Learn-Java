import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        PaymentSystem();
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


    @SuppressWarnings("unlikely-arg-type")
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
}