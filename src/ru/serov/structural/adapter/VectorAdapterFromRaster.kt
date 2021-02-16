package ru.serov.structural.adapter

class VectorAdapterFromRaster(private val rasterGraphics: RasterGraphics): IVectorGraphics {
    override fun drawLine() {
        rasterGraphics.drawRasterLine()
    }

    override fun drawSquare() {
        rasterGraphics.drawRasterSquare()
    }
}