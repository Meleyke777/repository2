package Dhomework;

public class PaypalProcessor implements Paymentprocessor { 
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}

