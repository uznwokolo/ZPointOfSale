import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class Customer {

    private String fullName;
    private String dateOfBirth;
    private Card customerCard;

    private ShoppingCart mycart;

    public Customer(){ }

    public Customer(String name, String dob, Card newCard)
    {
        this.fullName = name;
        this.dateOfBirth = dob;
        this.customerCard = newCard;

        mycart = new ShoppingCart();
    }

    public void printInfo() {
        System.out.println("==========================\n| NAME - "+getFullName()+"\n| DOB - "+
                getDateOfBirth()+ "\n| PAN - "+ getPan() +"\n==========================");
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Card getCustomerCard() {
        return this.customerCard;
    }

    public String getPan() {
        return this.getCustomerCard().getMaskedPan();
    }

    private void activateCard() {
        this.getCustomerCard().activateCard();
    }

    private void toggleCard() {
        this.getCustomerCard().toggleCard();
    }

    private void isMyCardEnabled() {
        if (this.getCustomerCard().isCardEnabled()){
            System.out.println("Your card is ENABLED");
        } else {
            System.out.println("Your card is DISABLED");
        }
    }

    public static void main(String[] args) {
        Card c1 = new Card(new char[]{'3','4','3','4','5','9','8','9','0','7','0','1','4','9','2','8'}, 363);
        Card c2 = new Card(new char[]{'3','4','3','4','5','9','8','9','0','7','0','1','4','9','2','8'}, 839);

        Customer bob = new Customer("Bobby Joe","10/09/1999",c1);
        Customer kat = new Customer("Kathy Joe","23/02/1997",c2);

        bob.printInfo();
        bob.isMyCardEnabled();
        bob.toggleCard();
        bob.isMyCardEnabled();
        bob.toggleCard();
        bob.isMyCardEnabled();
        bob.toggleCard();
        bob.isMyCardEnabled();
    }
}
