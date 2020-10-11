import java.util.Arrays;


public class Card {

    private char[] cardNumber;       // card number must be 16 digits
    private Integer secret;    // must be any number between 100 and 999
    private String billingAddress;   // gotten from Customer instance...or not
    private boolean isActive = false;        // set by the Customer instance


    public Card(char[] cNum, Integer key)
    {
        if ((cNum.length == 16) && ( 99 < key && key < 1000))
        {
            this.cardNumber = cNum;
            this.secret = key;
        }
    }

    public Card(char[] cNum, Integer key, String billAddr)
    {
        if ((cNum.length == 16) && ( 99 < key && key < 1000))
        {
            this.cardNumber = cNum;
            this.secret = key;
            this.billingAddress = billAddr;
        }
    }

    protected boolean isCardEnabled()
    {
        return this.isActive;
    }

    protected void toggleCard() {
        isActive = !isActive;
    }

    private char[] getFullPan(){
        return this.cardNumber;
    }

    protected String getMaskedPan()
    {
        char[] masked = getFullPan().clone();   // clone the actual card number
        for (int i = 4; i < 12; i++){         // mask the middle 8
            masked[i] = '*';                  // digits with '*'
        }
        return new String(masked);            // return a string
    }

    protected void activateCard()
    {
        this.isActive = true;
    }

    protected void setBillingAddress(String custAddr) {
        this.billingAddress = custAddr;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    /*public static void main(String[] args) {
        Card c1 = new Card(new char[]{'3','4','3','4','5','9','8','9','0','7','0','1','4','9','2','8'}, 363);

        System.out.println(c1.getMaskedPan());
        System.out.println(c1.getFullPan());
        System.out.println("Active: "+c1.isCardActive());
    }*/
}
