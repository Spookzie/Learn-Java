import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        StreamsDivisible();
    }
    
    
    //Takes in items' names and prints out the name back along with their time stamp.
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
    
    
    private static void BinarySearch()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int x = 8;

        int l = 0, h = arr.length - 1;

        while(l <= h)
        {
            int mid = (l + h) /2;

            if(arr[mid] == x)
            {
                System.out.println("Index of required no. is: " + mid);
                break;
            }
            else if(arr[mid] > x)
                h = mid - 1;
            else
                l = mid + 1;
        }
    }
    
    
    private static void Inheritance()
    {
        Person p = new Person("Person", "person's address");
    
        Student s = new Student("Student", "student's address");
        s.Study();
        s.Study();
    
        Teacher t = new Teacher("Teacher", "teacher's address", 27000);
    
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
    }


    private static void PackableInterface()
    {
        //IMPLEMENTATION 1: hard coding new items without box
        /*
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        */

        //IMPLEMENTATION 2: hard adding new items but with box
        /*
        Box box = new Box(10);

        box.Add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.Add(new Book("Robert Martin", "Clean Code", 1));
        box.Add(new Book("Kent Beck", "Test Driven Development", 0.7));
        
        box.Add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.Add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.Add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
        */

        //IMPLEMENTATION 3: Adding new items using packer
        Packer packer = new Packer();
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("How many items you want to add? ");
            int itemCount = Integer.parseInt(sc.nextLine());
            System.out.println(packer.GiveBoxOfThings(itemCount));
        }
    }


    private static void WarehouseClass()
    {
        Warehouse warehouse = new Warehouse();
        warehouse.AddProduct("Milk", 3, 10);
        warehouse.AddProduct("Coffee", 5, 6);
        warehouse.AddProduct("Buttermilk", 2, 20);
        warehouse.AddProduct("Yogurt", 2, 20);

        System.out.println("Products:");

        for (String product: warehouse.Products())
            System.out.println(product);
    }


    private static void StreamsAverage()
    {
        Streams streams = new Streams();
        streams.Average();
    }


    private static void StreamsDivisible()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        Streams streams = new Streams();

        ArrayList<Integer> divisible = streams.Divisible(numbers);

        divisible.stream().forEach(num -> System.out.println(num));
    }
}