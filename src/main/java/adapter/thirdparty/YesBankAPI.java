package adapter.thirdparty;

public class YesBankAPI {
    public boolean sendMoney(String from,String to,Double amount){
        return true;
    }
    public double balance(String account){
        return 0.0;
    }
}
