package org.example;

public class Main {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.processPayment(150.00); // Output: Processing credit card payment of $150.0

        payment = new PayPalPayment();
        payment.processPayment(200.00); // Output: Processing PayPal payment of $200.0

        payment = new BankTransferPayment();
        payment.processPayment(300.00); // Output: Processing bank transfer payment of $300.0
    }
}