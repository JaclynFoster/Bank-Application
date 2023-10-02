public class Savings extends Account {
    //List properties specific to the Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    //Constructor to initialize the Savings properties
        public Savings(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            accountNumber = "1" + accountNumber;
            System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
            System.out.println("NEW SAVINGS ACCOUNT");
        }

    //List any methods specific to Savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
