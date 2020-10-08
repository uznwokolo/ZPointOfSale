import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;


public class ShoppingCart {

    private ArrayList<Item> cart;
    private Timestamp timeCreated;


    public ShoppingCart()
    {
        /*Date dt = new Date();   dt.getTime()*/
        timeCreated = new Timestamp(new Date().getTime());

        cart = new ArrayList<>();
    }

    public Timestamp getTimeCartWasCreated()
    {
        return this.timeCreated;
    }

    public ArrayList<Item> getCart()
    {
        return this.cart;
    }

    public static void main(String[] args) {

        ShoppingCart sc = new ShoppingCart();
        System.out.println(sc.getTimeCartWasCreated());
    }
}
