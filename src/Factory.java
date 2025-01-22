import java.util.Random;


public class Factory
{
    public Packable ProduceNew()
    {
        Random ticket = new Random();
        int number = ticket.nextInt(6);
        
        switch (number)
        {
        case 0:
            return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        case 1:
            return new CD("Wigwam", "Nuclear Nightclub", 1975);
        case 2:
            return new CD("Rendezvous Park", "Closer to Being Here", 2012);
        case 3:
            return new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        case 4:
            return new Book("Robert Martin", "Clean Code", 1);
        default:
            return new Book("Kent Beck", "Test Driven Development", 0.5);
        }
    }   
}