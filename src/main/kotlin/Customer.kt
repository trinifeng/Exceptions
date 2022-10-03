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