package com.example.codesamplesapplication

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

enum class PayTypeEnum { CARD, PAYPAL, APPLE_PAY }

interface PaymentProcessor {
    fun process(amount: Double): Boolean
}

class CardPaymentProcessor : PaymentProcessor {
    override fun process(amount: Double): Boolean = true
}

class PaypalPaymentProcessor : PaymentProcessor {
    override fun process(amount: Double): Boolean = true
}

class ApplePayPaymentProcessor : PaymentProcessor {
    override fun process(amount: Double): Boolean = true
}

class PayMethod2(
    private val processors: Map<PayTypeEnum, PaymentProcessor>,
    private val logger: (String) -> Unit = { println(it) }
) {
    fun pay(type: PayTypeEnum, amount: Double): Boolean {
        val processor = processors[type]
            ?: throw IllegalArgumentException("Unsupported payment type: $type")
        val ok = processor.process(amount)
        logger("Paid $amount via $type, success=$ok")
        return ok
    }
}



