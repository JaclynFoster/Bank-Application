public class Savings extends Account {
    //List properties specific to the Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    //Constructor to initialize the Savings properties
        public Savings(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            System.out.println("NEW SAVINGS ACCOUNT");
            System.out.println(name);
        }

    //List any methods specific to Savings account
}
