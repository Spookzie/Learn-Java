import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse
{
    private final Map<String, Integer> productsPrices;
    private final Map<String, Integer> productsStock;


    //Constructor
    public Warehouse()
    {
        this.productsPrices = new HashMap<>();
        this.productsStock  = new HashMap<>();
    }

    
    //Setter
    public void AddProduct(String product, int price, int stock)
    {
        this.productsPrices.put(product, price);
        this.productsStock.put(product, stock);
    }


    public boolean Take(String product)
    {
        if (this.productsStock.containsKey(product))
        {
            int currentStock = this.productsStock.get(product);
            if (currentStock > 0)
            {    
                this.productsStock.put(product, currentStock-1);
                return true;
            }
            else
                return false;
        }

        return false;
    }


    //  ACCESSORS   //
    //-----------------------
    public int Price(String product)
    {
        if (this.productsPrices.containsKey(product))
            return this.productsPrices.get(product);

        return -99;
    }


    public int Stock(String product)
    {
        if (this.productsStock.containsKey(product))
            return this.productsStock.get(product);
        
        return 0;
    }


    public Set<String> Products()
    {
        return this.productsPrices.keySet();
    }
    //-----------------------
}