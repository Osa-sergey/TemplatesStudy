package ru.serov.structural.composite

class Item(private val price: Int): IReceipt {
    override fun getCost() = price
}