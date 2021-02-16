package ru.serov.structural.composite

class Receipt: IReceipt {
    private val components: ArrayList<IReceipt> = ArrayList()

    fun addComponent(component: IReceipt) = components.add(component)

    fun removeComponent(component: IReceipt) = components.remove(component)

    override fun getCost(): Int {
        var cost: Int = 0
        for(component in components){
            cost += component.getCost()
        }
        return cost
    }
}