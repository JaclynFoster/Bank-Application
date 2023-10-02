public class Savings extends Account {
    //List properties specific to the Savings Account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    //Constructor to initialize the Savings properties
        public Savings(String name, String sSN, double initDeposit) {
            super(name, sSN, initDeposit);
            accountNumber = "1" + accountNumber;
            setSafetyDepositBox();
            // System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
            // System.out.println("NEW SAVINGS ACCOUNT");
        }

    //List any methods specific to Savings account
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
        "Your Savings Account features:" + 
        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
        "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

}
