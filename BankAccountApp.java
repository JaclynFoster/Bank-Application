public class BankAccountApp {
    
    public static void main(String[] args) {
        Checking checkingAccount1 = new Checking("Tom Wilson", "3427184649", 1500);

        Savings savingAccount1 = new Savings("Rich Lowe", "4725492802", 2540);

        savingAccount1.showInfo();

        System.out.println("******************");
        checkingAccount1.showInfo();
        //Read a CSV file then create new accounts based on the data
    }
}
