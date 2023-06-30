package observer;

public class AnalyticsSender implements OrderPlacedSubscriber,OrderCancelledSubscriber{
    public AnalyticsSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Updating analaytics");
    }

    @Override
    public void announceOrderCancelled() {
        System.out.println("Cancelled : Updating analaytics");
    }
}
