/*
Class: Residential (subclass of Customer)
Author: Trini Feng
Date: 10/4/22

Parameters:
    customerName - stores the customer's name
    customerPhone - stores the customer's phone number
    customerAddress - stores the customer's address
    squareFootage - the number of square feet in a customer's property (all above inherited from Customer)
    isSenior - Boolean of whether the customer is a senior or not

Variables:
    rate - constant rate of .006, or $6 per 1000 square feet
    weeklyCharge - the weekly charge of the customer

Methods:
    display - returns a String with all class info, updated for subclass
    calculate - calculates weekly charge using rate and offers a 15% discount if the customer is a senior
 */

class Residential(customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double,
                  var isSenior: Boolean):
    Customer(customerName, customerPhone, customerAddress, squareFootage) {

    private var rate = .006
    var weeklyCharge = 0.0

    init {

    }

    override fun display(): String {
        return "${super.display()} \n Is senior: $isSenior \n Weekly Charge: $weeklyCharge"
    }

    override fun calculate() {
        weeklyCharge = rate * squareFootage
        if(isSenior)
            weeklyCharge *= 0.85
    }
}