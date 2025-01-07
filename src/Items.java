import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Items
{
    private final String name;
    private final String creationTime;

    public Items(String name)
    {
        this.name = name;
        
        LocalDateTime currenDateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.creationTime = currenDateTime.format(myFormatObj);
    }


    @Override
    public String toString()
    {
        return this.name + " (created at: " + this.creationTime + ")";
    }
}