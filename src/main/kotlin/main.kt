fun main() {

    var userResponse: Int
    do {
        println("1) Residential Customer")
        println("2) Commercial Customer")
        println("3) Done")

        print("Enter Number Choice: ")
        userResponse = readln().toInt()

        if(userResponse != 3)
        {
            print("Enter a customer name: ")
            var name = readln()

            print("Enter a customer phone: ")
            var phone = readln()

            print("Enter a customer address: ")
            var address = readln()

            print("Enter the square footage of the property: ")
            var sqFt = readln().toDouble()

            var customer = Customer(name, phone, address, sqFt)

            if (userResponse == 2)
            {
                print("Enter a property name: ")
                var propName = readln()

                print("Do you have multiple properties? Please enter true or false.")
                var multiprop = readln().toBoolean()

                customer = Commercial(name, phone, address, sqFt, propName, multiprop)
            }

            if(userResponse == 1)
            {
                print("Is the customer a senior? Please enter true or false. ")
                var senior = readln().toBoolean()

                customer = Residential(name, phone, address, sqFt, senior)
            }

            customer.calculate()
            println(customer.display())
        }
    } while (userResponse != 3)

    print("Thanks for registering your customer!")

}