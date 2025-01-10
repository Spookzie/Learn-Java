public class PaymentCard
{
    private double balance;

    public PaymentCard(double balance)
    {
        this.balance = balance;
    }

    
    public double GetBalance()  {   return this.balance;    }


    public void AddMoney(double amount)
    {
        this.balance += amount;
    }

    public void TakeMoney(double amount)
    {
        if (this.balance >= amount)
            this.balance -= amount;
        else
            System.out.println("Insufficient Balance! Cannot Spend " + amount); 
    }
}