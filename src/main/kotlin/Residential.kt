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