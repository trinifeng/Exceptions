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