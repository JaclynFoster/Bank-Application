
public class Checking extends Account {
    //List properties specific to a Checking Account
    int debitCardNumber;
    int debitCardPIN;

    //Constructor to initialize Checking Account properties
        public Checking(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            accountNumber = "2" + accountNumber;
            System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
            // System.out.println("NEW CHECKING ACCOUNT");
        }
    //List any methods specific to the Checking Account
    public void shownInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }

}