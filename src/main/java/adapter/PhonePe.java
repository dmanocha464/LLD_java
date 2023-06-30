package adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;
    public PhonePe(BankAPIAdapter bankAPIAdapter){
        this.bankAPIAdapter=bankAPIAdapter;
    }
    double doSomething() throws InterruptedException{
        double currentBalance=bankAPIAdapter.getBalance("Number");
        Thread.sleep(3000);
        return currentBalance;
    }
}
