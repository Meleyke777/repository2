package Dhomework;

public class StripeProcessor implements Paymentprocessor { 
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}
