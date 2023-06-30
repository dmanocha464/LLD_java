package adapter;

import adapter.thirdparty.IciciBankAPI;

public class IciciBankAPIAdapter implements BankAPIAdapter{
    private IciciBankAPI icicibankAPI= new IciciBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return icicibankAPI.balance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return icicibankAPI.sendMoney(fromAccount,toAccount,amount);
    }
}
