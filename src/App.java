import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        ItemsRunMethod();
    }
    
    
    private static void ItemsRunMethod()
    {
        ArrayList<Items> items = new ArrayList<>();
    
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter an item name: ");
            String itemName = sc.nextLine();
    
            while(!itemName.equals(""))
            {
                Items item = new Items(itemName);
                items.add(item);
                System.out.print("Enter an item name: ");
                itemName = sc.nextLine();
            }
    
            for(int i=0; i<items.size(); i++)
            {
                System.out.println(items.get(i));
            }
        }
    }
}