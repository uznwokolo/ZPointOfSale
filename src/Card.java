import java.util.Arrays;


public class Card {

    private char[] cardNumber;       // card number must be 16 digits
    private Integer secret;    // must be any number between 100 and 999
    private String billingAddress;   // gotten from Customer instance
    private boolean isActive;        // set by the Customer instance


    public Card(char[] cNum, Integer key)
    {
        if ((cNum.length == 16) && ( 99 < key && key < 1000))
        {
            this.cardNumber = cNum;
            this.secret = key;
            System.out.println("A card has been created.");
        }
        else {
            System.out.println("Card was not created. Reason: Invalid values.");
        }
    }

    public boolean isCardActive()
    {
        return this.isActive;
    }

    public char[] getFullPan(){
        return this.cardNumber;
    }

    public char[] getMaskedPan()
    {
        char[] masked = cardNumber.clone();   // clone the actual card number
        for (int i = 4; i < 12; i++){
            masked[i] = '*';
        }
        return masked;
    }


    public static void main(String[] args) {
        Card c1 = new Card(new char[]{'3','4','3','4','5','9','8','9','0','7','0','1','4','9','2','8'}, 363);

        System.out.println(c1.getMaskedPan());
        System.out.println(c1.getFullPan());
        System.out.println("Active: "+c1.isCardActive());
    }
}