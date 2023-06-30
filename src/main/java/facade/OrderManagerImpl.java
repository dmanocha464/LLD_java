package facade;

public class OrderManagerImpl implements OrderManager{
    private OrderProcessor orderProcessor;
    @Override
    public void createOrder() {
        orderProcessor.process();
    }
}
