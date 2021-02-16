package ru.serov.behavioral.state

class Radio() {

    private val stations = arrayListOf<IStation>(Radio1(),Business(),DFm())
    private var station: IStation = stations[0]
    private var pos = 1
    fun nextStation(){
        if(pos > 2) pos = 0
        station = stations[pos++]
    }
    fun play() = station.play()

}