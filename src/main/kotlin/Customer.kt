/*
Class: Customer
Author: Trini Feng
Date: 10/4/22

Parameters:
    customerName - stores the customer's name
    customerPhone - stores the customer's phone number
    customerAddress - stores the customer's address
    squareFootage - the number of square feet in a customer's property

Methods:
    display - returns a String with all class info
    calculate - added for implementation for subclasses
 */

open class Customer(var customerName: String,
               var customerPhone: String,
               var customerAddress: String,
               var squareFootage: Double
) {
    init {

    }

    open fun display(): String {
        return "Name: $customerName \n Phone Number: $customerPhone \n Address: $customerAddress \n Square Footage: $squareFootage"
    }

    open fun calculate() {

    }
}