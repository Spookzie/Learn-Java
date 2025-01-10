public class PaymentTerminal
{
    PaymentCard card;
    private int affordableMealsSold, heartyMealsSold;


    public PaymentTerminal(PaymentCard card)
    {
        this.card = card;
        this.affordableMealsSold = this.heartyMealsSold = 0;
    }


    public void BuyAffordableMeal(PaymentCard card)
    {
        if (card.GetBalance() >= 2.5)
        {
            card.TakeMoney(2.5);
            affordableMealsSold++;
            System.out.println("Affordable Meal Bought! Balance Left" + card.GetBalance());
        }
        else
            System.out.println("Insufficient Balance! Cannot buy an affordable meal");
    }
    
    
    public void BuyHeartyMeal(PaymentCard card)
    {
        if (card.GetBalance() >= 4.5)
        {
            card.TakeMoney(4.5);
            heartyMealsSold++;
            System.out.println("Hearty Meal Bought! Balance Left" + card.GetBalance());
        }
        else
            System.out.println("Insufficient Balance! Cannot buy a hearty meal");
    }


    @Override
    public String toString()
    {
        return "Balance Left: " + card.GetBalance()
            + "\nNo. of affordable meals sold: " + this.affordableMealsSold
            + "\nNo. of hearty meals sold: " + this.heartyMealsSold;
    }
}