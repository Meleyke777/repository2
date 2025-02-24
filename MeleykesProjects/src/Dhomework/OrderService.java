package Dhomework;

public class OrderService {
private Paymentprocessor paymentprocessor;

public OrderService(Paymentprocessor paymentprocessor) {
	this.paymentprocessor = paymentprocessor;
}

public void completeOrder(double amount) {
	paymentprocessor.processPayment(amount);
}
}
