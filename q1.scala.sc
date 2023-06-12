def calculateDiskArea(radius: Double): Double = {
  val pi = 3.14159265359
  val area = pi * radius * radius
  area
}

val radius = 5
val diskArea = calculateDiskArea(radius)
println(s"The area of the disk with radius $radius is $diskArea")

