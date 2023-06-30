package adapter;

import adapter.thirdparty.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesbankAPI=new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return yesbankAPI.balance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return yesbankAPI.sendMoney(fromAccount,toAccount,amount);
    }
}
