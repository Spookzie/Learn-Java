public class Packer
{
    private final Factory factory;
    

    public Packer()
    {
        this.factory = new Factory();
    }


    public Box GiveBoxOfThings(int total_items)
    {
        Box box = new Box(10);

        for(int i=0; i<total_items; i++)
        {
            Packable newItem = factory.ProduceNew();
            box.Add(newItem);
        }

        return box;
    }
}