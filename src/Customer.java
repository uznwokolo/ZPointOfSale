import java.text.SimpleDateFormat;
import java.util.Date;


public class Customer {

    private String fullName;
    private String dateOfBirth;
    private Card customerCard;

    public Customer(){ }

    public Customer(String name, String dob, Card newCard)
    {
        this.fullName = name;
        this.dateOfBirth = dob;
        this.customerCard = newCard;
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

    private void activateCard() {
        this.customerCard.activateCard();
    }

    public static void main(String[] args) {
        Card c1 = new Card(new char[]{'3','4','3','4','5','9','8','9','0','7','0','1','4','9','2','8'}, 363);
        Card c2 = new Card(new char[]{'3','4','3','4','5','9','8','9','0','7','0','1','4','9','2','8'}, 839);

        Customer bob = new Customer("Bobby Joe","10/09/1999",c1);
        Customer kat = new Customer("Kathy Joe","23/02/1997",c2);

        System.out.println(bob.getCustomerCard().isCardActive());
        bob.activateCard();
        System.out.println(bob.getCustomerCard().isCardActive());
        System.out.println(kat.getCustomerCard().isCardActive());
    }
}
