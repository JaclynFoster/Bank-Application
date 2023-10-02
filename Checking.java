
public class Checking extends Account {
    //List properties specific to a Checking Account
    int debitCardNumber;
    int debitCardPIN;

    //Constructor to initialize Checking Account properties
    public Checking(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            accountNumber = "2" + accountNumber;
            setDebitCard();
            // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
            // System.out.println("NEW CHECKING ACCOUNT");
        }
    //List any methods specific to the Checking Account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
        System.out.println("CARD: " + this.debitCardNumber);
        System.out.println("PIN: " + this.debitCardPIN);
    }

    public void shownInfo() {
        super.showInfo();
        System.out.println("Your Checking Account features" + 
        "\n Debit Card Number: " + debitCardNumber +
        "\n Debit Card PIN: " + debitCardPIN
        
        );
    }

}