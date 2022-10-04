/*
Class: Commercial (subclass of Customer)
Author: Trini Feng
Date: 10/4/22

Parameters:
    customerName - stores the customer's name
    customerPhone - stores the customer's phone number
    customerAddress - stores the customer's address
    squareFootage - the number of square feet in a customer's property (all above inherited from Customer)
    propertyName - the name of the customer's property (1st one if there are multiple)
    isMultiProperty - Boolean of whether the commercial customer has multiple properties or not

Variables:
    rate - constant rate of .005, or $5 per 1000 square feet
    weeklyCharge - the weekly charge of the customer

Methods:
    display - returns a String with all class info, updated for subclass
    calculate - calculates weekly charge using rate and offers a 10% discount for multiple properties
 */

class Commercial(customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double,
                 var propertyName: String,
                 var isMultiProperty: Boolean):
    Customer(customerName, customerPhone, customerAddress, squareFootage){

    private var rate = .005
    var weeklyCharge = 0.0

    init {

    }

    override fun display(): String {
        return "${super.display()} \n Property Name: $propertyName \n Is multi-property: $isMultiProperty \n Weekly Charge: $weeklyCharge"
    }

    override fun calculate() {
        weeklyCharge = rate * squareFootage
        if(isMultiProperty)
            weeklyCharge *= 0.9

    }
}