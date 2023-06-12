def celsiusToFahrenheit(Celsius : Double): Double = {

  val Fahrenheit = Celsius * 1.8000 + 32.00
  Fahrenheit
}

val Celsius = 35
val Fahrenheit = celsiusToFahrenheit(Celsius)
println(s"The celsius $Celsius is to Fahrenheit $Fahrenheit")