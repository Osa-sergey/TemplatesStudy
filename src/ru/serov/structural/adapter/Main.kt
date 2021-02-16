package ru.serov.structural.adapter

fun main() {
    /** Мы просто вызываем методы через адаптер
     * Сейчас это похоже на делигат, но мы можем написать более сложную
     * логику в адапторе при необходимости 
     */
    val adapter = VectorAdapterFromRaster(RasterGraphics())
    adapter.drawLine()
    adapter.drawSquare()
}