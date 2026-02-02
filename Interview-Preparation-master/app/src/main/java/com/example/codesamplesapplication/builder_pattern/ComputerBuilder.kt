package com.example.codesamplesapplication.builder_pattern

class ComputerBuilder {
    private var graphicsCard: Boolean = false
    private var wifiCard: Boolean = false
    private var bluetooth: Boolean = false

    fun installGraphicsCard(graphicsCard: Boolean) = apply {
        this.graphicsCard = graphicsCard
    }

    fun installWifiCard(wifiCard: Boolean) = apply {
        this.wifiCard = wifiCard
    }

    fun installBluetooth(bluetooth: Boolean) = apply {
        this.bluetooth = bluetooth
    }

    fun build(): Computer {
        return Computer(graphicsCard, wifiCard, bluetooth)
    }
}