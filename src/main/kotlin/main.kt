import java.lang.IllegalArgumentException
import java.lang.NullPointerException
import java.lang.NumberFormatException
import java.text.NumberFormat

/*
Class: Main
Author: Trini Feng
Date: 10/4/22

Menu operates between entering a residential customer or commercial customer.
User input creates all the variables and parameters for these classes depending on which option is selected.
At the very end, a new customer is created and information is displayed.
 */

fun main() {

    var userResponse: Int = 0
    do {
        println("1) Residential Customer")
        println("2) Commercial Customer")
        println("3) Done")

        print("Enter Number Choice: ")
        try {
            userResponse = readln().toInt()
            if(userResponse <= 0 || userResponse >= 4)
                throw IllegalArgumentException("User response must be a number 1, 2, or 3")
        }
        catch (exception: NumberFormatException) {
            println("User response must be a number!")
        }

        if(userResponse != 3)
        {
            print("Enter a customer name: ")
            var name = readln()

            print("Enter a customer phone: ")
            var phone = readln()

            print("Enter a customer address: ")
            var address = readln()

            var sqFt: Double = 0.0
            print("Enter the square footage of the property: ")
            try {
                sqFt = readln().toDouble()
                if (sqFt == 0.0)
                    throw IllegalArgumentException("Square footage must be greater than 0")
            }
            catch (exception: NumberFormatException) {
                println("Square footage has to be a number!")
            }

            var customer = Customer(name, phone, address, sqFt)

            if (userResponse == 2)
            {
                print("Enter a property name: ")
                var propName = readln()

                print("Do you have multiple properties? Please enter true or false. ")
                var multiprop = readln().toBoolean()

                customer = Commercial(name, phone, address, sqFt, propName, multiprop)
            }

            if(userResponse == 1)
            {
                print("Is the customer a senior? Please enter true or false. ")
                var senior = readln().toBoolean()

                customer = Residential(name, phone, address, sqFt, senior)
            }
            try {
                customer.calculate()
                println(customer.display())
            }
            catch (exception: NullPointerException) {
                println("Customer object is invalid.")
            }
        }
    } while (userResponse != 3)

    print("Thanks for registering your customer!")

}