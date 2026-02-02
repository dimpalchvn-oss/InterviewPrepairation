package com.example.codesamplesapplication.kotlin_practice

enum class PayType { CARD, PAYPAL, APPLE_PAY }

class PayMethod{
    fun pay(type: PayType, amount: Double): Boolean {
        return when (type) {
            PayType.CARD -> {
                val ok = processCard(amount)
                log("Paid $amount via CARD, success=$ok")
                ok
            }
            PayType.PAYPAL -> {
                val ok = processPaypal(amount)
                log("Paid $amount via PAYPAL, success=$ok")
                ok
            }
            PayType.APPLE_PAY -> {
                    val ok = processApplePay(amount)
                log("Paid $amount via APPLE_PAY, success=$ok")
                ok
            }
        }
    }

    private fun log(message: String) {
        println(message)
    }

    private fun processCard(amount: Double): Boolean = true
    private fun processPaypal(amount: Double): Boolean = true
    private fun processApplePay(amount: Double): Boolean = true
}

/*Refactor the above code using Open-Closed Principal*/


interface PayTypeInterface {
    fun pay(amount: Double): Boolean
}

class GPayMethod : PayTypeInterface{
    override fun pay(amount: Double): Boolean{
        val ok = processGPay(amount)
        log("Paid $amount via CARD, success=$ok")
        return ok
    }

    private fun processGPay(amount: Double): Boolean = true

    private fun log(message: String) {
        println(message)
    }
}

class CardPayMethod : PayTypeInterface{
    override fun pay(amount: Double): Boolean{
        val ok = processCard(amount)
        log("Paid $amount via CARD, success=$ok")
        return ok
    }
    private fun processCard(amount: Double): Boolean = true

    private fun log(message: String) {
        println(message)
    }
}

class PaypalPayMethod : PayTypeInterface{
    override fun pay(amount: Double): Boolean{
        val ok = processPaypal(amount)
        log("Paid $amount via PAYPAL, success=$ok")
        return ok
    }
    private fun processPaypal(amount: Double): Boolean = true

    private fun log(message: String) {
        println(message)
    }
}

class ApplePayMethod : PayTypeInterface{
    override fun pay(amount: Double): Boolean{
        val ok = processApplePay(amount)
        log("Paid $amount via APPLE_PAY, success=$ok")
        return ok
    }
    private fun processApplePay(amount: Double): Boolean = true

    private fun log(message: String) {
        println(message)
    }
}