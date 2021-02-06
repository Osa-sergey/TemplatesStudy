package ru.serov.creational.kit

interface ICompanyFactory {
    fun createCompanyInfo(): ICompanyInfo
    fun createCompanyProducts(): ICompanyProducts
}