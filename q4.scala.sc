def priceWithoutDiscount(price : Double, copy : Int): Double = {
  val wholePrice = price * copy
  wholePrice
}

def priceWithDiscount(total : Double, discount : Double): Double ={
  val discountPrice = total * discount
  discountPrice
}

def shipIngCost(copy : Int): Double = {
  val nextCopy = copy-50
  val shipment = nextCopy * 0.75 + 50 * 3
  shipment
}

def totalCost(x : Double, y : Double ): Double ={
  val Total = x+y
  Total
}

val copy = 60
val price = 24.95
val discount = 0.40

val a = priceWithoutDiscount(price, copy)
val b = priceWithDiscount(a, discount)
val c = shipIngCost(copy)
val d = totalCost(b,c)

println(s"Total cost when import $copy copies are Rs.$d")

