public class Person
{
    private final String  name, address;

    
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString()
    {
        return this.name + "\n\t" + this.address;
    }
}