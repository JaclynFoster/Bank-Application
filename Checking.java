
public class Checking extends Account {
    //List properties specific to a Checking Account
    int debitCardNumber;
    int debitCardPIN;

    //Constructor to initialize Checking Account properties
        public Checking(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            System.out.println("NEW CHECKING ACCOUNT");
            System.out.println("NAME: " + name);
        }
    //List any methods specific to the Checking Account

}