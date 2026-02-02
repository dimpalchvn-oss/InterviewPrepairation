package com.example.codesamplesapplication//package com.example.codesamplesapplication
//
//open class PaymentProcessor {
//
//    fun processCreditCard(amount: Double, cardNumber: String, expiry: String, cvv: String) {
//        println("Connecting to Visa/Master API...")
//        println("Charging $$amount to card $cardNumber")
//        logTransaction("CreditCard", amount)
//        sendEmail("Payment of $$amount successful via Credit Card")
//    }
//
//    fun processPaypal(amount: Double, email: String, password: String) {
//        println("Connecting to PayPal API...")
//        println("Charging $$amount to PayPal account $email")
//        logTransaction("PayPal", amount)
//        sendEmail("Payment of $$amount successful via PayPal")
//    }
//
//    private fun logTransaction(method: String, amount: Double) {
//        println("Saving transaction: $method - $$amount to DB")
//    }
//
//    private fun sendEmail(message: String) {
//        println("Sending email: $message")
//    }
//}
//
//interface PaymentProcessor {
//    open fun processPayment(amount: Double)
//}
//
//interface LoggingInterface{
//    fun log_message(val details: String){
//
//    }
//}
//
//class CreditCardPayment: PaymentProcessor @Inject constructor()  {
//    override fun processPayment() {
//
//    }
//}
//
//class PaypalPayment: PaymentProcessor() {
//    override fun processPayment() {
//
//    }
//}
//
//class XYZPayment: PaymentProcessor() {
//    override fun processPayment() {
//
//    }
//}
//
