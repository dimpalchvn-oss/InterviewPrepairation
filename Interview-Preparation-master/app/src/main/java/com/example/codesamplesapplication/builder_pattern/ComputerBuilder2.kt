package com.example.codesamplesapplication.builder_pattern

class ComputerBuilder2 {
    private var graphicsCard: Boolean = false
    private var wifiCard: Boolean = false
    private var bluetooth: Boolean = false

    fun installGraphicsCard(install: Boolean): ComputerBuilder2 {
        this.graphicsCard = install
        return this
    }

    fun installWIFICard(install: Boolean): ComputerBuilder2 {
        this.wifiCard = install
        return this
    }

    fun installBluetooth(install: Boolean): ComputerBuilder2 {
        this.bluetooth = install
        return this
    }

    fun build(): Computer {
        return Computer(this.graphicsCard, this.wifiCard, this.bluetooth)
    }
}