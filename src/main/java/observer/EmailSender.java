package observer;

public class EmailSender implements OrderPlacedSubscriber{
    public EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    public void sendEmail() {
        System.out.println("Sending Email");
    }
    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }
}
