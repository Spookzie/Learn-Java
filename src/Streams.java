import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Streams
{
    public void Average()
    {
        List<String> inputs = new ArrayList<>();

        System.out.println("Enter nos., type 'end' to stop:");
        try(Scanner sc = new Scanner(System.in))
        {
            while(true)
            {
                String row = sc.nextLine();
                if(row.equals("end"))
                    break;
                
                inputs.add(row);
            }
        }

        double outputAll = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average().getAsDouble();
        
        double outputNeg = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(i -> i<0).average().getAsDouble();
            
        double outputPos = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(i -> i>0).average().getAsDouble();
    
        System.out.println("Average of all the nos.: " + outputAll);
        System.out.println("Average of all the -ve nos.: " + outputNeg);
        System.out.println("Average of all the +ve nos.: " + outputPos);
    }


    public ArrayList<Integer> Divisible(ArrayList<Integer> nums)
    {
        return nums.stream().filter((Integer i) -> {
            if(i%2==0)
                return true;
            else if(i%3==0)
                return true;
            else if(i%5==0)
                return true;
            
            return false;
        }).collect(Collectors.toCollection(ArrayList::new));
    }
}